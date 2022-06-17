package com.br.server;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.br.server.model.User;
import com.br.server.repository.UserRepository;

@Component
@Transactional
public class InitialPopulationDatabase implements CommandLineRunner {
  
  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User user1 = new User("Brendson");
    user1.setEmail("brendson.example@gmail.com");
    user1.setTelefone("(81)9 8861-5976");

    userRepository.save(user1);
  }
}
