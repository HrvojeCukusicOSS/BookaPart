package com.hrvojecukusic.bookapart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrvojecukusic.bookapart.models.UserEntity;
import com.hrvojecukusic.bookapart.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<UserEntity> getHosts(){
		return userRepository.findByRole("host");
	}
}
