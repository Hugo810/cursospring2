package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.br.model.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItemPK, Long>{
	

}
