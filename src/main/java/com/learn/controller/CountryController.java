package com.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.modal.Country;

@RestController
public class CountryController {
	@RequestMapping("/country")
	public Country country(@RequestParam(value="cntry", defaultValue="def_country") String name) {
		System.out.println(name);
		return new Country(1L, name, "das_capital");
	}
	
	@RequestMapping(value = "/country_name", method = RequestMethod.POST)
	public Country capital(@RequestParam(value="data", defaultValue="def_country") String name) {
		return new Country(1L, name, "new_capital");
	}

}
