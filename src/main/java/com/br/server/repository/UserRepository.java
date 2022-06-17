package com.br.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.server.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
