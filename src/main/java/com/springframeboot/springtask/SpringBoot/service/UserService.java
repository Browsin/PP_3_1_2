package com.springframeboot.springtask.SpringBoot.service;

import com.springframeboot.springtask.SpringBoot.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User findById(Integer id);

    void createOrUpdateUser(User user);

    void deleteUser(Integer id);
}
