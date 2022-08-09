package com.hrvojecukusic.bookapart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
	@GetMapping("reviews")
	public String getReviews(){
		return "reviews";
	}
}
