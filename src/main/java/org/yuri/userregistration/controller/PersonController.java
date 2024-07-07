package org.yuri.userregistration.controller;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yuri.userregistration.dtos.PersonDTO;
import org.yuri.userregistration.model.Person;
import org.yuri.userregistration.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.readAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Person> createPerson(@RequestBody @Valid PersonDTO data) {
        Person person = new Person(data);
        personService.create(person);
        return ResponseEntity.status(200).build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity<Person> updatePerson(@RequestBody @Valid PersonDTO data) {
        Optional<Person> personOptional = personService.read(data.id());
        if (personOptional.isPresent()) {
            Person person = new Person(data);
            personService.update(person);
            return ResponseEntity.ok(person);

        } else throw  new EntityNotFoundException();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Person> deletePerson(@PathVariable String id) {
        Optional<Person> personOptional = personService.read(id);
        if (personOptional.isPresent()) {
            personService.delete(id);
            return ResponseEntity.noContent().build();

        } else throw  new EntityNotFoundException();
    }
}
