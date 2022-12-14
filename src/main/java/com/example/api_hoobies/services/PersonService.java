package com.example.api_hoobies.services;
import com.example.api_hoobies.dao.*;
import com.example.api_hoobies.models.*;
import com.example.api_hoobies.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements ServiceTemplate<Person>{
    @Autowired
    private PersonDao repository;

    @Override
    public List<Person> list() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Person save(Person data) {
        return repository.save(data);
    }

    @Override
    public void delete(Person data) {
        repository.delete(data);
    }

    @Override
    public Optional<Person> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Person findById(String id) {
        return null;
    }
}
