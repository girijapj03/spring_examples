package com.giri.fruit;

public class Fruit {
	public String name;
	public double price;
	public String color;
	public boolean tasty;
	public Vitamin vitamin;

	public Fruit(String name, double price, String color, boolean tasty, Vitamin vitamin) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.tasty = tasty;
		this.vitamin = vitamin;
	}

	public void provideEnergy() {
		System.out.println("invoked provideEnergy");
		vitamin.growth();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTasty() {
		return tasty;
	}

	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	public Vitamin getVitamin() {
		return vitamin;
	}

	public void setVitamin(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

}
