package com.tdea.demo3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tdea.demo3.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository <Person, Long>{

}
