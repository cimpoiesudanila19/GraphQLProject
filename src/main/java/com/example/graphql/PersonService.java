package com.example.graphql;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {

    private Map<String, Person> personMap = new HashMap<>();

    public PersonService() {
        personMap.put("1", new Person("1", "John Doe", 30));
        personMap.put("2", new Person("2", "Jane Doe", 25));
    }

    public Person getPersonById(String id) {
        return personMap.get(id);
    }
}