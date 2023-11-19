package br.com.bruno.service;

import br.com.bruno.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Nome");
        person.setLastName("Sobrenome");
        person.setAddress("Goiania");
        person.setGender("Feminino");
        return person;
    }

}
