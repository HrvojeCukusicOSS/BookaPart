package com.hrvojecukusic.bookapart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.repositories.ApartmentRepository;

@Service
public class ApartmentService {
	@Autowired
	private ApartmentRepository apartmentRepository;
	
	public List<ApartmentEntity> getApartments(){
		return apartmentRepository.findAll();
	}
	
	public void save(ApartmentEntity apartment){
		apartmentRepository.save(apartment);
	}
}
