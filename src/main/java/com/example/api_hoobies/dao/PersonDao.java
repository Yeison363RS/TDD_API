package com.example.api_hoobies.dao;

import com.example.api_hoobies.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}
