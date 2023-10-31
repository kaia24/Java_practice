package com.kaiaModica.safetravels.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kaiaModica.safetravels.models.Travel;
import com.kaiaModica.safetravels.services.TravelService;



@Controller
public class HomeController {
	@Autowired
	private TravelService travelService;

	@GetMapping("/")
	public String dashboard(HttpSession session, Model model) {
	
		model.addAttribute("travelList", travelService.allTravels());
		return "dashboard.jsp";
	}

	@GetMapping("/travels/new")
	public String newTravelForm(@ModelAttribute("travel") Travel travel) {
		return "newTravel.jsp";
	}

	@PostMapping("/travels/new")
	public String processCreate(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "newTravel.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}

	@GetMapping("/travels/{id}")
	public String travelDetails(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.oneTravel(id);
		model.addAttribute("travel", travel);
		return "oneTravel.jsp";
	}

	@GetMapping("/travels/edit/{id}")
	public String editTravelForm(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.oneTravel(id);
		model.addAttribute("travel", travel);
		return "editTravel.jsp";

	}

	@PostMapping("/travels/edit/{id}")
	public String processEditTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "editTravel.jsp";
		} else {
			travelService.editTravel(travel);
			return "redirect:/";
		}
	}
	@DeleteMapping("/travels/delete/{id}")
	public String deleteTravel(@PathVariable("id")Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
	}

	

}
