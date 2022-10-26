package com.example.api_hoobies.util;

import com.example.api_hoobies.models.Person;

import java.util.List;
import java.util.Optional;

public interface ServiceTemplate<T> {

    public List<T> list();
    public T save(T data);
    public void delete(T data);
    public Optional<T> findById(Long id);
    public T findById(String id);

}