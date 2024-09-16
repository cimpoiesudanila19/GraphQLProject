package com.example.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QueryResolver {

    private final PersonService personService;

    public QueryResolver(PersonService personService) {
        this.personService = personService;
    }

    /* POST
    http://localhost:8080/graphql
    Headers -> Content-Type: application/json
    Body -> raw: JSON

    {
        "query": "{ hello }"
    }
    {
        "query": "{ getPerson(id: \"1\") { id, name, age } }"
    }
     */
    @QueryMapping
    public String hello() {
        return "Hello, GraphQL!";
    }

    @QueryMapping
    public Person getPerson(String id) {
        return personService.getPersonById(id);
    }
}