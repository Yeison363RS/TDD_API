package com.example.api_hoobies.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "identify_number")
    private Long idNumber;

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

    @Column(name = "person_hobbies")
    private String hobbies;
}
