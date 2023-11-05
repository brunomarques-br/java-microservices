package br.com.bruno.service;

import br.com.bruno.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    //simular um ID
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Bruno");
        person.setLastName("Marques");
        person.setAddress("Brasilia");
        person.setGender("Masculino");
        return person;
    }

}
