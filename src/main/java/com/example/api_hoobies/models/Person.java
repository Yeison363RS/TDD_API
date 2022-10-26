package com.example.api_hoobies.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private Long idPerson;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_lastname")
    private String lastName;

    @Column(name = "person_county")
    private String country;

    @Column(name = "person_department")
    private String department;

    @Column(name = "person_city")
    private String city;
    @OneToMany(mappedBy = "person")
    private List<Hoobie> hoobies = new ArrayList<>();

   @ManyToMany(fetch = FetchType.LAZY,
    cascade = {
        CascadeType.PERSIST,
                CascadeType.MERGE
    })
    @JoinTable(
            name = "group_user",
            joinColumns = {@JoinColumn(name = "id_person")},
            inverseJoinColumns = {@JoinColumn(name = "id_group")}
    )
    private List<GroupA> groups = new ArrayList<>();
    public void addGroup(GroupA group){
        this.groups.add(group);
    }
    public void addHoobie(Hoobie hoobie) {
        this.hoobies.add(hoobie);
        hoobie.setPerson(this);
    }
}
