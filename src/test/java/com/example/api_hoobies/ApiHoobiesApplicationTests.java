package com.example.api_hoobies;

import com.example.api_hoobies.services.PersonService;
import com.example.api_hoobies.models.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiHoobiesApplicationTests {
     private PersonService serviceP;
     private Person person;
    @Test
    void contextLoads() {
    }
    @Test
    void saveClient(){
        serviceP.save(person);
    }
    void validateNameUser(){
        person=new Person();
    }

}
