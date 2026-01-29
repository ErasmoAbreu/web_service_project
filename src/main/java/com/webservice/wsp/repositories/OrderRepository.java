package com.webservice.wsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.wsp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
