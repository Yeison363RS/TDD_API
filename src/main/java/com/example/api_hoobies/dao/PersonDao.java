package com.example.apitdd.dao;

import com.example.apitdd.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}