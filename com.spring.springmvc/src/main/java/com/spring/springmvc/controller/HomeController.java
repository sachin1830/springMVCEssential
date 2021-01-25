package com.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String homePage()
	{
		System.out.println("Index mapping..........");
		return "index";
		
	}

}
