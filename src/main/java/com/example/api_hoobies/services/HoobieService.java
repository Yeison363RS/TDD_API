package com.example.api_hoobies.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.api_hoobies.dao.*;
import com.example.api_hoobies.models.*;
import com.example.api_hoobies.util.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoobieService implements ServiceTemplate<Hoobie>{

    @Autowired
    private HoobieDao repository;

    @Override
    public List<Hoobie> list() {
        return repository.findAll();
    }

    @Override
    public Hoobie save(Hoobie data) {
        return repository.save(data);
    }

    @Override
    public void delete(Hoobie data) {
        repository.delete(data);
    }

    @Override
    public Optional<Hoobie> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Hoobie findById(String id) {
        return null;
    }
}
