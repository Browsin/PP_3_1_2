package com.springframeboot.springtask.SpringBoot.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;
}
