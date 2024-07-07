package org.yuri.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yuri.userregistration.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> { }
