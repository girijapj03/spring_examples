package com.giri.fruit;

public class Vitamin {
	public String type;
	public boolean waterSoluble;
	public boolean fatSoluble;

	public Vitamin(String type, boolean waterSoluble, boolean fatSoluble) {
		super();
		this.type = type;
		this.waterSoluble = waterSoluble;
		this.fatSoluble = fatSoluble;
	}

	public void growth() {
		System.out.println("invoked growth");
	}

	@Override
	public String toString() {
		return "Vitamin [type=" + type + ", waterSoluble=" + waterSoluble + ", fatSoluble=" + fatSoluble + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isWaterSoluble() {
		return waterSoluble;
	}

	public void setWaterSoluble(boolean waterSoluble) {
		this.waterSoluble = waterSoluble;
	}

	public boolean isFatSoluble() {
		return fatSoluble;
	}

	public void setFatSoluble(boolean fatSoluble) {
		this.fatSoluble = fatSoluble;
	}

}
