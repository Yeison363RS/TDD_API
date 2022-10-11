package com.example.api_hoobies.controllers;
import com.example.api_hoobies.services.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@Slf4j

public class ControllerPerson {

    @Autowired
    private PersonService service ;

    @PostMapping("/savePerson")
    public void savePerson(){

    }
}
