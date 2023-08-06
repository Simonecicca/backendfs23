package com.epicode.esercizi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.esercizi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
