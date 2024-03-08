package com.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is home url");
        model.addAttribute("name" , "Pushpendra Kashyap");
        model.addAttribute("Id" , 100001);
        
        List<String> friends = new ArrayList<String>();
        friends.add("Rishu");
        friends.add("Astush");
        friends.add("Pushpit");
        
        model.addAttribute("f",friends);
        
        return "hello";
    }
	
	@RequestMapping("/message")
	public ModelAndView modelAndViewTest() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Pushpendra");
		modelAndView.addObject("roll", 70);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		now.toString();
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		modelAndView.addObject("list",l1);
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
