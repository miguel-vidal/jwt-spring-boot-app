package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

	
	//metodo de spring boot implementado
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//logica para traer el usuario de la DB
		
		//clase user de spring security
		//Este usuario es para cuando ejecutamos localhost:8080/ para el login
		return new User("admin", "password", new ArrayList<>());
	}

	
}
