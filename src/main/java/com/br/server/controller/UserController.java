package com.br.server.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.server.model.User;
import com.br.server.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class UserController {
  
  @Autowired
  UserRepository userRepository;

  @PostMapping("/user")
  public ResponseEntity<User> create(@Valid @RequestBody User user) {
    User newUser = userRepository.save(user);

    return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
  }

  @GetMapping("/user")
  public List<User> read(){
    return this.userRepository.findAll();
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<User> readId(@PathVariable(value = "id") Long id){
    Optional<User> user = this.userRepository.findById(id);
    if (user.isPresent()) {
      return new ResponseEntity<User>(user.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/user/{id}")
  public ResponseEntity<User> update(@PathVariable(value = "id") Long id, @Valid @RequestBody User newUser){
    Optional<User> oldUser = this.userRepository.findById(id);

    if (oldUser.isPresent()) {
      User user = oldUser.get();

      user.setNome(newUser.getNome());
      user.setEmail(newUser.getEmail());
      user.setTelefone(newUser.getTelefone());

      this.userRepository.save(user);

      return new ResponseEntity<User>(user, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/user/{id}")
  public ResponseEntity<User> delete(@PathVariable(value = "id") Long id){
    Optional<User> user = this.userRepository.findById(id);

    if (user.isPresent()) { 

      this.userRepository.deleteById(id);

      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
