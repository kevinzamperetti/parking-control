package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	private ParkingSpotRepository repository;

	public ParkingSpotService(ParkingSpotRepository repository) {
		this.repository = repository;
	}
	
	

}
