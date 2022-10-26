package com.example.api_hoobies.dao;

import com.example.api_hoobies.models.Hoobie;
import com.example.api_hoobies.models.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
    List<Hoobie> findHoobieByIdPerson(long idNumber);
}
