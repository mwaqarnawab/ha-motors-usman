package com.boraji.tutorial.spring.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boraji.tutorial.spring.model.User;
import com.boraji.tutorial.spring.service.UserService;

/**
 * @author imssbora
 */
@Controller
public class UserController {

   @Autowired
   private UserService userService;

   @GetMapping("/")
   public String userForm(Model model) {
/*ModelAndView mav = new ModelAndView("index");*/
     /* model.addAttribute("user", new User());
      model.addAttribute("users", userService.list());*/

      /*return "userForm";*/
	   model.addAttribute("error","");
	   model.addAttribute("user", new User());
	   return "index";
   }
   
   @GetMapping("/loginFailure")
   public String loginFailure(Model model) {
/*ModelAndView mav = new ModelAndView("index");*/
     /* model.addAttribute("user", new User());
      model.addAttribute("users", userService.list());*/

      /*return "userForm";*/
	   model.addAttribute("error","Incorrect Username or Password");
	   model.addAttribute("user", new User());
	   return "index";
   }

   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute("user") @Valid User user,
         BindingResult result, Model model) {

      if (result.hasErrors()) {
         
         model.addAttribute("users", userService.list());
         return "userForm";
      }

      userService.save(user);

      return "redirect:/";
   }
   
   @PostMapping("/loginUser")
   public String loginUser(@ModelAttribute("user") @Valid User user,
         BindingResult result, Model model) {
	   if(user == null || user.getUserName().isEmpty() || user.getPassword().isEmpty()){
		   return "redirect:/loginFailure";
	   }
     /* if (result.hasErrors()) {
         
         model.addAttribute("users", userService.list());
         return "userForm";
      }

      userService.save(user);*/
	   
	  User user1 =  userService.findUserByUserName(user.getUserName());
	  if(user1 == null){
		  return "redirect:/loginFailure";
	  }
	  else if(user1.getPassword().equals(user.getPassword())){
		  return "userForm";
	  }
	  else {
		 /* model.addAttribute("error","Incorrect Username or password");*/
		  return "redirect:/loginFailure";
	  }
	   
     
   }
}
