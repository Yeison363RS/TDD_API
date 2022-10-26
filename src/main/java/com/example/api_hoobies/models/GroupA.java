package com.example.api_hoobies.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "GroupA")
public class GroupA {
    @Id
    @GeneratedValue
    private Long idGroupA;

    @Column(name = "name_group")
    private String nameGroup;

    @Column(name = "location_group")
    private String location;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "groups")

    @JsonIgnore
    private List<Person> people = new ArrayList<>();
}
