package com.hrvojecukusic.bookapart.controllers;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.services.ApartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ApartmentController {

	@Autowired
	private ApartmentService apartmentService;
	
	public ApartmentController(ApartmentService apartmentService) {
		this.apartmentService = apartmentService;
	}
	
	@GetMapping("/apartments")
	public String getApartments(Model model) {
		var apartmentList = apartmentService.getApartments();

		model.addAttribute("apartments", apartmentList);

		return "apartments";
	}
	

}
