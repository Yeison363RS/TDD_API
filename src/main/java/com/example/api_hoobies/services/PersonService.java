package com.example.api_hoobies.services;
import com.example.api_hoobies.dao.*;
import com.example.api_hoobies.models.*;
import com.example.api_hoobies.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PersonService implements ServiceTemplate<Person>{
    @Autowired
    private PersonDao repository;

    @Override
    public List<Person> list() {
        return null;
    }

    @Override
    public void save(Person data) {

    }

    @Override
    public void delete(Person data) {

    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public Person findById(String id) {
        return null;
    }
}
