package com.project.vehicleidentification.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home")
	public String backHome() {
		return "home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@GetMapping("/login")
	public String login() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "login";
        }
		return "redirect:/admin";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}

}
