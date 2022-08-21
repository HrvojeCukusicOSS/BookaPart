package com.hrvojecukusic.bookapart.controllers;

import com.hrvojecukusic.bookapart.payloads.ApartmentDto;
import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.services.ApartmentService;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ApartmentController {
	@Autowired
	private ModelMapper modelMapper;
	private ApartmentService apartmentService;
	
	public ApartmentController(ApartmentService apartmentService) {
		this.apartmentService = apartmentService;
	}
	
	@GetMapping("apartments")
	public List<ApartmentDto> getApartments() {
		return apartmentService.getApartments().stream().map(apartment -> modelMapper.map(apartment, ApartmentDto.class))
				.collect(Collectors.toList());
	}
	
	@PostMapping("apartments/addnew")
	public ResponseEntity<ApartmentDto> createApartment(@RequestBody ApartmentDto apartmentDto) {
		ApartmentEntity apartmentRequest = modelMapper.map(apartmentDto, ApartmentEntity.class);
		
		ApartmentEntity apartment = apartmentService.createApartment(apartmentRequest);
		
		ApartmentDto apartmentResponse = modelMapper.map(apartment, ApartmentDto.class);
		
		return new ResponseEntity<ApartmentDto>(apartmentResponse, HttpStatus.CREATED);
	}
}
