package com.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.dao.TourLocationRepository;
import com.api.model.TourLocation;

@RestController
public class TourLocationController {
	
	@Autowired
	TourLocationRepository tourLocationRepository;
	
	
	@GetMapping("/getalllocations")
	
	public ArrayList<TourLocation> getAllLocations(){
		
		ArrayList<TourLocation> tourLocations = new ArrayList<>();
		
		tourLocationRepository.findAll().forEach((e)->tourLocations.add(e));
		
		return tourLocations;
	}
	
	@PostMapping("/addlocation")
	public String addTourLocation(@RequestBody TourLocation tourLocation) {
		tourLocationRepository.save(tourLocation);
		return "tour location added successfullly";
	}
	
	@PatchMapping("/updatelocation")
	
	public String updateTourLocation(@RequestBody TourLocation tourLocation) {
		tourLocationRepository.save(tourLocation);
		return "tour location updated successfully";
	}
	
	@DeleteMapping("/deletelocation")
	
	public String deleteTourLocation(@RequestParam int locationId) {
		tourLocationRepository.deleteById(locationId);
		return "tour user deleted successfully";
	}

}
