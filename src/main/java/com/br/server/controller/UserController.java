package com.br.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/user")
  public List<User> read(){
    return this.userRepository.findAll();
  }

  @GetMapping("/user/{id}")
  public Optional<User> readId(@PathVariable(value = "id") Long id){
    return this.userRepository.findById(id);
  }
}
