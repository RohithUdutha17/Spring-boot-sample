package com.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.dao.TourRepository;
import com.api.model.TourUser;

@RestController
public class TourController {

	@Autowired
	TourRepository tourRepository;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/getallusers")
	
	public ArrayList<TourUser> getAllUsers(){
		
		ArrayList<TourUser> tourUsers = new ArrayList<>();
		
		tourRepository.findAll().forEach((e)->tourUsers.add(e));
		
		return tourUsers;
	}
	
	@PostMapping("/adduser")
	public String addTourUser(@RequestBody TourUser tourUser) {
		tourRepository.save(tourUser);
		return "tour user added successfullly";
	}
	
	@PatchMapping("/updateuser")
	
	public String updateUser(@RequestBody TourUser tourUser) {
		tourRepository.save(tourUser);
		return "tour user updated successfully";
	}
	
	@DeleteMapping("/userdelete")
	
	public String deleteUser(@RequestParam int userId) {
		tourRepository.deleteById(userId);
		return "tour user deleted successfully";
	}
}
