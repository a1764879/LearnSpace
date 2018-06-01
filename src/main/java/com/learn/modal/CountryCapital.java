package com.learn.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryCapital {
	
	@JsonProperty
	private String country;
	
	@JsonProperty
	private String city;
	
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCity(String capital) {
		this.city = capital;
	}

}
