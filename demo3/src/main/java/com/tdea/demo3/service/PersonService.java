package com.tdea.demo3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdea.demo3.entity.Person;
import com.tdea.demo3.repository.PersonRepository;

@Service
public class PersonService {
	
	    @Autowired
	    private PersonRepository personRepository;

	    public Person saveOrUpdate(Person person) {
	        return personRepository.save(person);
	    }

	    public List<Person> getPerson() {
	        return personRepository.findAll();
	    }

	    public Optional<Person> getById(Long id) {
	        return personRepository.findById(id);
	    }

	    public void delete(Long id) {
	        personRepository.deleteById(id);
	    }
	}

