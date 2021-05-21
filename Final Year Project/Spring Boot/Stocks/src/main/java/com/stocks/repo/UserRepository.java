package com.stocks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
	User findFirstByOrderByIdDesc();
	
	boolean existsByEmail(String email);
	
	boolean existsByPass(String pass);
	
}
