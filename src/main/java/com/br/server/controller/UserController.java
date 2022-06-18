package com.br.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.server.model.User;
import com.br.server.repository.UserRepository;

@RestController
@RequestMapping(value = "/api")
public class UserController {
  
  @Autowired
  UserRepository userRepository;

  @PostMapping("/user")
  public User create(@RequestBody User user) {
    return this.userRepository.save(user);
  }
}
