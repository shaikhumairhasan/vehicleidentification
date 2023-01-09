package com.project.vehicleidentification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.vehicleidentification.entity.Owner;
import com.project.vehicleidentification.service.OwnerService;

@Controller
public class OperationController {

	@Autowired
	private OwnerService ownerService;
	
	@GetMapping("/owner")
	public ModelAndView getOwner(@RequestParam("vehicleNumber") String vehicleNumber) {
		String number = vehicleNumber.toUpperCase();
		Owner owners = ownerService.getOwner(number);
		ModelAndView modelAndView = new ModelAndView("owner");
		modelAndView.addObject("owners", owners);
		return modelAndView;
	}
	
	@GetMapping("/admin")
	public ModelAndView getOwners() {
		ModelAndView modelAndView = new ModelAndView("admin");
		modelAndView.addObject("owners", ownerService.getOwners());
		return modelAndView;
	}
	
	@PostMapping("/admin/add")
	public String addOwner(@ModelAttribute Owner owner) {
		ownerService.addOwner(owner);
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/delete/{vehicleNumber}")
	public String deleteOwner(@PathVariable(name = "vehicleNumber") String vehicleNumber) {
		String number = vehicleNumber.toUpperCase();
		ownerService.deleteOwner(number);
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/edit/{vehicleNumber}")
	public ModelAndView editOwner(@PathVariable(name = "vehicleNumber") String vehicleNumber) {
		String number = vehicleNumber.toUpperCase();
		Owner owner = ownerService.getOwner(number);
		ModelAndView modelAndView = new ModelAndView("edit");
		modelAndView.addObject("owner", owner);
		return modelAndView;
	}
	
	@PostMapping("/imageUpload")
	public ModelAndView imageUpload(@RequestBody MultipartFile img) {
		Owner owner = ownerService.ocr(img);
		ModelAndView modelAndView = new ModelAndView("owner");
		modelAndView.addObject("owners", owner);
		return modelAndView;
	}
}
