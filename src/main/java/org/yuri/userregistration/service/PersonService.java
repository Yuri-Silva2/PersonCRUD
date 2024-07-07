package org.yuri.userregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuri.userregistration.model.Person;
import org.yuri.userregistration.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void create(Person data) {
        personRepository.save(data);
    }

    public void update(Person data) {
        Optional<Person> dataOptional = personRepository.findById(data.getId());
        if (dataOptional.isPresent()) {
            Person person = dataOptional.get();
            person.setName(data.getName());
            person.setPassword(data.getPassword());
        }
    }

    public void delete(String id) {
        personRepository.deleteById(id);
    }

    public Optional<Person> read(String id) {
        return personRepository.findById(id);
    }

    public List<Person> readAll() {
        return personRepository.findAll();
    }
}
