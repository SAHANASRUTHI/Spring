package com.kgisl.sb1.repository;


import org.springframework.data.repository.ListCrudRepository;

import com.kgisl.sb1.entity.Person;

public interface PersonRepository extends ListCrudRepository<Person, Long> {
}