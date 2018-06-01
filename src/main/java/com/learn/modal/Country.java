package com.learn.modal;

public class Country {

	private final long id;
	private final String name;
	private final String capital;
	
	public Country(long id, String name, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

}
