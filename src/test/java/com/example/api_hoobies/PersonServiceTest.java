package com.example.api_hoobies;

import com.example.api_hoobies.services.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:db-test.properties")
@Sql("/valuesDefaultPersons.sql")
public class PersonServiceTest {
    @Autowired
    private PersonService service;
    @Test
    void testFindAllPersons(){
        assertEquals(3,service.list().size());
    }
}
