package com.ejer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejer.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
