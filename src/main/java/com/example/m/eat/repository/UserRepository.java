package com.example.m.eat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.m.eat.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
