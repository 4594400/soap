package com.ws.app;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ProcessorImpl implements Prosessor {
    private List<Person> persons = new ArrayList<>();

    @WebMethod
    public void save(Person p) {
        persons.add(p);
        System.out.println("Person was added. Size = " + persons.size());
    }

    @WebMethod
    public List<Person> getAllPerson() {
        return persons;
    }
}
