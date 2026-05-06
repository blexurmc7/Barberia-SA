//package com.tdea.demo3.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Service;
//
//import com.tdea.demo3.entity.Person;
//import com.tdea.demo3.repository.PersonRepository;
//
//@Service
//
//public class CustomUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//
//    private PersonRepository repository;
//
//
//    @Override
//
//    public UserDetails loadUserByUsername(String username) {
//
// 
//    	 
//        Person user = repository.findByName(username);
//        
//        return new User(
//
//            user.getUserName(),
//
//            user.getPassword(),
//
//            List.of(new SimpleGrantedAuthority(user.getRol()))
//
//        );
//    }
//
//}
