package com.search_num_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search_num_2.dto.NumData;
import com.search_num_2.services.SearchNumService;

@Controller
public class SearchNumController {
	
	@Autowired
	private SearchNumRestClient numRestClient;
	
	@Autowired
	private SearchNumService searchService;
	
	// http://localhost:8086/showNumPage

	@GetMapping("/showNumPage")
	public String findNumbers() {
		
		return "findNum";
	}
	
	@PostMapping("/searchNum")
	public String showNumbers(@RequestParam("id") int id, Model model) {
		
		NumData numbers = numRestClient.findNum(id);
		
		model.addAttribute("nums", numbers);
		
		return "showNum";
	}
	
	@GetMapping("/sum")
	public String showAddition(@RequestParam("fnum") int fnum, @RequestParam("snum") int snum, Model model) {
		
		int result = searchService.addTwoNumbers(fnum, snum);
		
		model.addAttribute("res", result);
		
		return "showResult";
	}
}
