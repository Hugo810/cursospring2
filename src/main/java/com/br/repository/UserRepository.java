package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.User;
import com.br.repository.*;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
