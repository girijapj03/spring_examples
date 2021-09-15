package com.giri.airport;

public class Airport {
	private String name;
	private String location;

	public Airport(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		System.out.println("Airport bean created");
	}

	public void runWay() {
		System.out.println("**invoked RUNWAY**");
	}

	public void maintenance() {
		System.out.println("**invoked MAINTENANCE**");
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + "]";
	}

}
