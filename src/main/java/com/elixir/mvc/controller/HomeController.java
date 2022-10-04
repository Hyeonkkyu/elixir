package com.elixir.mvc.controller;

import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("hello", "hello! good day for you!");
		return "apiHome";
	}
}
