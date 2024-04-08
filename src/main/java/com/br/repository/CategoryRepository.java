package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Category;
import com.br.repository.*;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
