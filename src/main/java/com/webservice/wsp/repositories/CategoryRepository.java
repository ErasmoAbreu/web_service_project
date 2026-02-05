package com.webservice.wsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.wsp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
