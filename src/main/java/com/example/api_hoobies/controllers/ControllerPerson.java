package com.example.api_hoobies.controllers;
import com.example.api_hoobies.models.GroupA;
import com.example.api_hoobies.models.Hoobie;
import com.example.api_hoobies.models.Person;
import com.example.api_hoobies.services.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/people")
@Slf4j
public class ControllerPerson {

    @Autowired
    private PersonService service ;

    @Autowired
    private  HoobieService hoobieService;
    @Autowired
    private GroupAService groupAService;

    @PostMapping("/savePerson")
    public ResponseEntity<Person> savePerson(@RequestBody Person person){
        Person personResp =service.save(person);
        return new ResponseEntity<>(personResp, HttpStatus.OK);
    }
    @PostMapping("/addHoobie/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void saveHoobie(@PathVariable(name = "id", required = true) Long id,@RequestBody Hoobie hoobie){
        Person per= service.findById(id).get();
        per.addHoobie(hoobie);
        hoobieService.save(hoobie);
        log.info("se agrego un1hoobie"+hoobie.getNameHoobie());
    }
    @PostMapping("/addGroup/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<GroupA> addGroupToUser(@PathVariable(name = "id", required = true) Long id,@RequestBody GroupA groupA){
        GroupA group = groupAService.addGroup(id,groupA);
        if(group==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(group, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Person>> getPersons(){
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable(name = "id", required = true) Long id){
        Person person=service.findById(id).get();
        if(person==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
