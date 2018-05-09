package com.boraji.tutorial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue
   @Column(name = "userId")
   private Long userId;

   @Column(name = "userName")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   private String userName;

   @Column(name = "password", unique = true)
   @Email(message = "{user.password.invalid}")
   private String password;

   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

}
