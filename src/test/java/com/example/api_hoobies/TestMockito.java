package com.example.api_hoobies;

import com.example.api_hoobies.dao.HoobieDao;
import com.example.api_hoobies.dao.PersonDao;
import com.example.api_hoobies.models.Person;
import com.example.api_hoobies.services.PersonService;
import org.hibernate.PersistentObjectException;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Before;
import org.mockito.MockitoAnnotations.*;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:db-test.properties")
@Sql("/CleanTablePersons.sql")
public class TestMockito {
    @Autowired
    PersonDao personRepo;
    @Mock
    private PersonDao dependency;
    @InjectMocks
    private PersonService serviceP;
    @Mock
    private HoobieDao daoHoobie;
    @Test
    @Before
    void testFindAllPersons(){
        MockitoAnnotations.openMocks(this);
        List<Person> list=new ArrayList<Person>();
        list.add(new Person());
        when(dependency.findAll()).thenReturn(list);
        assertEquals(1,dependency.findAll().size());
    }
    @Test
    public void testGet(){
        Person per=new Person();
        per.setName("maria");
        per.setCity("Tunja");
        Optional<Person> op= Optional.of(per);
        when(dependency.findById(anyLong())).thenReturn(op);
        assertEquals("maria", op.map(Person::getName).orElse("nn"));
    }
    @Test
    public void testServiceGetPersons(){
        Person per=new Person();
        per.setName("maria");
        per.setCity("Tunja");
        Optional<Person> op= Optional.of(per);
        when(dependency.findById(anyLong())).thenReturn(op);
        assertEquals("maria",serviceP.findById(30L).get().getName());
    }
    @Test
    public void testSavePerson(){
        Person per=new Person();
        per.setName("Juliana");
        per.setCity("Tunja");
        per.setCountry("colombia");
        per.setLastName("martinez");
        per.setDepartment("Boyaca");
        assertEquals(per.getName(),personRepo.save(per).getName());
    }
}
