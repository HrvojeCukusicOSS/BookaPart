package com.hrvojecukusic.bookapart.services;

import java.util.ArrayList;
import java.util.List;

import com.hrvojecukusic.bookapart.mappers.ApartmentMapper;
import com.hrvojecukusic.bookapart.payloads.ApartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrvojecukusic.bookapart.models.ApartmentEntity;
import com.hrvojecukusic.bookapart.repositories.ApartmentRepository;

@Service
public class ApartmentService {
	@Autowired
	private ApartmentRepository apartmentRepository;
	@Autowired
	private ApartmentMapper apartmentMapper;
	
	public ApartmentService(ApartmentRepository apartmentRepository) {
		this.apartmentRepository = apartmentRepository;
	}
	
	public List<ApartmentDto> getApartments(){
		var toMap = apartmentRepository.findAll();
		var apartments = new ArrayList<ApartmentDto>();
		for (var apartment:toMap) {
			apartments.add(apartmentMapper.apartmentToApartmentDto(apartment));
		}
		return apartments;
	}
	
	public ApartmentEntity createApartment(ApartmentEntity apartment){
		return apartmentRepository.save(apartment);
	}
	
	public void deleteApartment(int id) {
		var apartment = apartmentRepository.findById(id); 
		
		apartmentRepository.delete(apartment.get());
	}

	public ApartmentDto getApartmentById(int id) {
		var toMap = apartmentRepository.findById(id).orElse(null);
		var result = apartmentMapper.apartmentToApartmentDto(toMap);
		return result;
	}
}
