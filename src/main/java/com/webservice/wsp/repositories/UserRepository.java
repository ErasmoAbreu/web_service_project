package com.webservice.wsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.wsp.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
