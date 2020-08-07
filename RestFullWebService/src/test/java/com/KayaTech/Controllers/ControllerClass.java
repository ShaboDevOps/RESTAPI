package com.KayaTech.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@RequestMapping("hello")
	
	public String display() {
		
		return "helloooo REST.........";
	}

}