package com.learn.modal;

public class Country {

	private final long id;
	private final String name;
	private final String capital;
	
	public Country(long id, String name, String temp) {
		super();
		this.id = id;
		this.name = name;
		this.capital = temp;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTemp() {
		return capital;
	}
}
