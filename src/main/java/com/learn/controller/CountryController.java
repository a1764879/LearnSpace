package com.learn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.dao.CountryLoadDao;
import com.learn.modal.Country;

@RestController
public class CountryController {
	
	private Map<String,String> countryMap = new HashMap<String,String>();
	
	@RequestMapping("/country")
	public Country country(@RequestParam(value="cntry", defaultValue="def_country") String name) {
		String capital = countryMap.get(name);
		return new Country(1L, name, capital);
	}
	
	@RequestMapping("/capita_load")
	@ResponseBody
	public Set<String> countryLoad() {
		countryMap = CountryLoadDao.loadCountry();
		Set<String> cList = countryMap.keySet();
		return cList;
	}
	
	
	

}
