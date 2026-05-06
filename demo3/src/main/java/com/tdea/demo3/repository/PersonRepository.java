package com.tdea.demo3.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tdea.demo3.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository <Person, Long>{
	    List<Person> findByNombreCliente(String nombreCliente);
	    List<Person> findByNombreBarbero(String nombreBarbero);
	    List<Person> findByEstado(String estado);
	}

