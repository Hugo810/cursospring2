package com.br.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.model.Product;
import com.br.repository.*;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product>findAll(){
		return repository.findAll();
		
	}
	public Product findById(Long id) {
		Optional<Product> obj =repository.findById(id);
		return obj.get();
	}

		
}


