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
	
	public ApartmentService(ApartmentRepository apartmentRepository) {
		this.apartmentRepository = apartmentRepository;
	}
	
	public List<ApartmentEntity> getApartments(){
		return apartmentRepository.findAll();
	}
	
	public ApartmentEntity createApartment(ApartmentEntity apartment){
		return apartmentRepository.save(apartment);
	}
	
	public void deleteApartment(int id) {
		var apartment = apartmentRepository.findById(id); 
		
		apartmentRepository.delete(apartment.get());
	}

	public ApartmentEntity getApartmentById(int id) {
		var result = apartmentRepository.findById(id);
		
		return result.get();
	}
}
