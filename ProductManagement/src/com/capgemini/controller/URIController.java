package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.beans.Product;


@Controller
public class URIController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "indexPage";
	}
	
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	
	@ModelAttribute("product")
		public Product getProduct() {
		return new Product();
	}

}
