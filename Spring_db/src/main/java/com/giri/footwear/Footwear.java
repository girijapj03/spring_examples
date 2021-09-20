package com.giri.footwear;


public class Footwear {
	private double price;
	private String brand;
	private String color;
	private Material material;

	public Footwear(double price, String brand, String color, Material material) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.material = material;
	}

	public void walk() {
		System.out.println("invoked walk()");
		material.protection();
	}

	public double getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public Material getMaterial() {
		return material;
	}

}
