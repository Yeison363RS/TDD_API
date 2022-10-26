package com.example.api_hoobies.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hoobie")
public class Hoobie {
    @Id
    @GeneratedValue
    private Long idHoobie;

    @Column(name = "name_hoobie")
    private String nameHoobie;
    @ManyToOne
    @JoinColumn(name="id_person")
    @JsonIgnore
    private Person person;
}
