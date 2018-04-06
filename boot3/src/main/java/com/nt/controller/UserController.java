package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Entityclass;
import com.nt.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Entityclass user) {
		userRepository.save(user);
		
	}
	
	@RequestMapping(value="/{id}")
	public void read(@PathVariable String Email) {
		userRepository.findOne(Email);
		
	}
	@RequestMapping(value="/{findall}")
	public void readall(@PathVariable String Email) {
		userRepository.findAll();
		
	}
	

	
	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public void update(Entityclass user){
		userRepository.save(user);
	}
	
	
	

	
	
/*@RequestMapping(value="/{update}",consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public void update(Entityclass user){
		userRepository.save(user);
	}*/
	
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void delete(Entityclass first_Name) {
		userRepository.delete(first_Name);;	
	}
}
