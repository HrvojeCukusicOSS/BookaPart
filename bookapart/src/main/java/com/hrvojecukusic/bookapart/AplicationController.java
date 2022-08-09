package com.hrvojecukusic.bookapart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {
	
	@GetMapping("index")
	public String goHome(){
		return "index";
	}
}
