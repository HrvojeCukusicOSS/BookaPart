package com.hrvojecukusic.bookapart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hrvojecukusic.bookapart.models.UserEntity;
import com.hrvojecukusic.bookapart.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("hosts")
	public String getUsers(Model model) {
		List<UserEntity> userList = userService.getHosts();
		model.addAttribute("hosts", userList);
		
		return "hosts";
	}
}
