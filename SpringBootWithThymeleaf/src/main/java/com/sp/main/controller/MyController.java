package com.sp.main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/openProfile")
	public String welcome(Model model) {
		String name = "Deepak Bisen";
		model.addAttribute("modelName", name);
		return "Profile";
	}
	
	@GetMapping("/openConditional")
	public String openConditionalPage(Model model) {
		int n1 = 30;
		int n2 = 78;
		model.addAttribute("num1",n1);
		model.addAttribute("num2", n2);
		
		return "conditional";
	}
	
	@GetMapping("/openLooping")
	public String openLoopingPage(Model model) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		model.addAttribute("modelNumbers",numbers);
		return "looping";
	}
}
