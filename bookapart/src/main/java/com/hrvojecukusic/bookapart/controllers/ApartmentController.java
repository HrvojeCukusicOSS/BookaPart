package com.hrvojecukusic.bookapart.controllers;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.services.ApartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApartmentController {
	@Autowired
	private ApartmentService apartmentService;
	
	@GetMapping("apartments")
	public String getApartments(Model model){
		
		List<ApartmentEntity> apartmentList = apartmentService.getApartments();
		model.addAttribute("apartments", apartmentList);
		
		return "apartments";
	}
}
