package com.springframeboot.springtask.SpringBoot.repository;

import com.springframeboot.springtask.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
