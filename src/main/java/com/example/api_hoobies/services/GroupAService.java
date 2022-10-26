package com.example.api_hoobies.services;

import com.example.api_hoobies.dao.GroupADao;
import com.example.api_hoobies.dao.PersonDao;
import com.example.api_hoobies.models.GroupA;
import com.example.api_hoobies.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api_hoobies.util.*;

import java.util.List;
import java.util.Optional;

@Service
public class GroupAService implements ServiceTemplate<GroupA>{


    @Autowired
    private GroupADao repository;
    @Autowired
    private PersonDao persoRep;

    @Override
    public List<GroupA> list() {
        return repository.findAll();
    }

    @Override
    public GroupA save(GroupA data) {
        return repository.save(data);
    }

    @Override
    public void delete(GroupA data) {
        repository.delete(data);
    }

    @Override
    public Optional<GroupA> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public GroupA findById(String id) {
        return repository.findById(Long.parseLong(id)).get();
    }

    public GroupA addGroup(long id, GroupA groupA){
        GroupA groA = persoRep.findById(id).map(per->{
            per.addGroup(groupA);
            groupA.getPeople().add(per);
            repository.save(groupA);
            return groupA;
        }).orElse(null);
        return groA;
    }
}
