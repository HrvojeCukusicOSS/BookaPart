package com.hrvojecukusic.bookapart.controllers;

import com.hrvojecukusic.bookapart.models.CityEntity;
import com.hrvojecukusic.bookapart.services.CityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CityController {
	@Autowired
	private CityService cityService;
	
	@GetMapping("cities")
	public String getCitys(Model model) {
		List<CityEntity> cityList = cityService.getCitys();
		model.addAttribute("cities", cityList);
		
		return "cities";
	}
}
