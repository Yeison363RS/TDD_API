package com.example.api_hoobies.services;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonService {
    @Autowired
    PersonDao reposritory;
}
