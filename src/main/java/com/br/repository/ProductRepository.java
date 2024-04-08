package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Product;
import com.br.repository.*;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
