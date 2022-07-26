package com.cg.mc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {

	
	@GetMapping("/second")
	public String getSecondMessage(){
		
		return "DJ Spin that....";
	}
	
}
