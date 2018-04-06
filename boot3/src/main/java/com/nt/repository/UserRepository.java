package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.entity.Entityclass;

public interface UserRepository extends MongoRepository<Entityclass,String>{

	void findOne(String first_Name);

	
	

}
