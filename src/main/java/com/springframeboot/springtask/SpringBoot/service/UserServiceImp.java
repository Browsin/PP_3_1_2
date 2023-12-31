package com.springframeboot.springtask.SpringBoot.service;

import com.springframeboot.springtask.SpringBoot.model.User;
import com.springframeboot.springtask.SpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

   private final UserRepository userRepository;

   @Autowired
   public UserServiceImp(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Override
   public List<User> getAllUsers() {
      return userRepository.findAll();
   }

   @Override
   public User findById(Integer id) {
      return userRepository.findById(id)
              .orElse(null);
   }

   @Override
   public void createOrUpdateUser(User user) {
      userRepository.save(user);
   }

   @Override
   public void deleteUser(Integer id) {
      userRepository.deleteById(id);
   }
}
