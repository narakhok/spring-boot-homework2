package com.kshrd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {

	@RequestMapping(value= {"/","/index","/home"})
	public String index() {
		System.out.println("Welcome to Spring boot Homepage..!");
		return "frontend/index";
	}
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("Contact Page...!");
		return "frontend/contact";
	}
	@ResponseBody
	@RequestMapping("/book")
	public String getTitle(@RequestParam(name = "title", required = false) String title) {		
		System.out.println(title);
		return title;
	}
	
	
		@ResponseBody
		@RequestMapping("/book/{title}")
		public String homes(@PathVariable("title") String title) {
			System.out.println(title);
			return title;
		}
}
