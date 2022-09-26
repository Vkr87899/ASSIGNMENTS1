package com.pharmacystore.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pharmacystore.model.Drugs;
import com.pharmacystore.service.IPharmacyService;

@Controller
public class PharmacyController {
	@Autowired
   IPharmacyService iPharmacyService;
	@RequestMapping("/")
	public String homePage(Model model)
	{
		List<Drugs>drugs=iPharmacyService.getAlldrugs();
		model.addAttribute("drugs",drugs);
		return "index";
		
	}
	@RequestMapping("/admin")
	public String adminPage(Model model)
	{
		return "addDrug";
		
	}
	@RequestMapping("/deleteDrug")
	public String deletePage(Model model)
	{
		return "deletedrugform";
		
	}
	@RequestMapping("/removedrug")
	public String removeDrug(@RequestParam("drug_id")int drugId)
	{
		iPharmacyService.deleteDrug(drugId);
		return "admin";
		
	}
	
}
