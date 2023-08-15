package com.camila.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class ControllerEnrut {


		
	
	@RequestMapping("/coding")
	public String hola() {
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "¡Python/Django fue increíble!";
		
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		return "¡Java/Spring es mejor! ";	
		}
	
	
public ControllerEnrut() {
		// TODO Auto-generated constructor stub
	
}
}
