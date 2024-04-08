package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Order;
import com.br.repository.*;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
