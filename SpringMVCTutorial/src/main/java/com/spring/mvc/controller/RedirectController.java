package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/urlone")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/urltwo";
	}
	
	@RequestMapping("/urltwo")
	public String two() {
		System.out.println("This is second handler");
		return "contact";
	}

}
