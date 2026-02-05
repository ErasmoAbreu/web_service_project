package com.webservice.wsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.wsp.entities.Category;
import com.webservice.wsp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
