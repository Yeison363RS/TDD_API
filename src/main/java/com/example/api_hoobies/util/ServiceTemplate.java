package com.example.api_hoobies.util;

import java.util.List;

public interface ServiceTemplate<T> {

    public List<T> list();
    public void save(T data);
    public void delete(T data);
    public T findById(Long id);
    public T findById(String id);

}