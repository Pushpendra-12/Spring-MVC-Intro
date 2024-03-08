package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
//import com.spring.mvc.service.UserService;
import com.spring.mvc.service.UserService;



@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showcontact")
	public String showForm() {
		System.out.print("show form");
	    return "contact";
	}
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("email") String useremail,
//			@RequestParam("Name") String userName, 
//			@RequestParam("password") String userPass, Model model) {
//		
//		System.out.println("User email " +useremail);
//		System.out.println("User Name " +userName);
//		System.out.println("User Password " +userPass);
//		
//		
//		
//		model.addAttribute("email",useremail );
//		model.addAttribute("name", userName);
//		model.addAttribute("password", userPass);
//		
//		
//		
//		return "success";
//	}
	
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleContact(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		int id = this.userService.createUser(user);
		model.addAttribute("userCreated", "Thank you for registering your user id is " + id);
		return "success";
	}
	
}
