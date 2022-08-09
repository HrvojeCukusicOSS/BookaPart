package com.hrvojecukusic.bookapart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {
	
	
	@GetMapping("bookings")
	public String getBookings(Model model){
		
		return "bookings";
	}
}
