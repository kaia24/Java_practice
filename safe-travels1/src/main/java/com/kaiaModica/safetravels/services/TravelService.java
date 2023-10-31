package com.kaiaModica.safetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiaModica.safetravels.models.Travel;
import com.kaiaModica.safetravels.repositories.TravelRepository;



@Service
public class TravelService {
	@Autowired
	private TravelRepository travelRepo;
	public List<Travel> allTravels() {
		return travelRepo.findAll();
	}
	public Travel createTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	public Travel editTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	public Travel oneTravel(Long id) {
		Optional<Travel> optionalTravel = travelRepo.findById(id);
		if (optionalTravel.isPresent()) {
			return optionalTravel.get();
		} else {
			return null;
		}
	}
	public void deleteTravel(Long id) {
		travelRepo.deleteById(id);
	}
}
