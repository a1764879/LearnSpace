package com.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.modal.Country;

@RestController
public class CountryController {
	@RequestMapping("/country")
	public Country country(@RequestParam(value="name", defaultValue="def_country") String name) {
		return new Country(1L, name, "new_capital");
	}

}
