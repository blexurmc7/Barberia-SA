package com.tdea.demo3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdea.demo3.entity.Person;
import com.tdea.demo3.service.PersonService;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
 @Autowired
 private PersonService personService;

 @GetMapping
 public List<Person> getPerson() {
     return personService.getPerson();
 }

 @GetMapping("/{id}")
 public Optional<Person> getById(@PathVariable Long id) {
     return personService.getById(id);
 }

 @PostMapping
 public Person save(@RequestBody Person person) {
     return personService.saveOrUpdate(person);
 }

 @DeleteMapping("/{id}")
 public void delete(@PathVariable Long id) {
     personService.delete(id);
 }
}

