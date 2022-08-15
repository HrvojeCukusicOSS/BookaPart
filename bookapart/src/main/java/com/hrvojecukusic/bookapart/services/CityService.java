package com.hrvojecukusic.bookapart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrvojecukusic.bookapart.models.CityEntity;
import com.hrvojecukusic.bookapart.repositories.CityRepository;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;
	
	public List<CityEntity> getCitys(){
		return cityRepository.findAll();
	}
}
