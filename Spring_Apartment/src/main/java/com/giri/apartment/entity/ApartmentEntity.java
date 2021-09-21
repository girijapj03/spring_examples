package com.giri.apartment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="apartment")
public class ApartmentEntity implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
@Column(name="APARMENT_ID")
private byte apartmentID;
@Column(name="Apartment_Name")
private String name;
@Column(name="Apartment_location")
private String location;
@Column(name="NO_OF_FLOORS")
private int noOfFloors;
@Column(name="IS_LIFT_THERE")
private boolean isLiftAvailable;
@Column(name="FLAT_PRICE")
private double flatPrice;
@Column(name="IS_PARKING_THERE")
private boolean isParkingAvailable;
public ApartmentEntity() {
	// TODO Auto-generated constructor stub
}
public ApartmentEntity(String name, String location, int noOfFloors, boolean isLiftAvailable, double flatPrice,
		boolean isParkingAvailable) {
	super();
	this.name = name;
	this.location = location;
	this.noOfFloors = noOfFloors;
	this.isLiftAvailable = isLiftAvailable;
	this.flatPrice = flatPrice;
	this.isParkingAvailable = isParkingAvailable;
}
@Override
public String toString() {
	return "ApartmentEntity [apartmentID=" + apartmentID + ", name=" + name + ", location=" + location + ", noOfFloors="
			+ noOfFloors + ", isLiftAvailable=" + isLiftAvailable + ", flatPrice=" + flatPrice + ", isParkingAvailable="
			+ isParkingAvailable + "]";
}
public byte getApartmentID() {
	return apartmentID;
}
public void setApartmentID(byte apartmentID) {
	this.apartmentID = apartmentID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfFloors() {
	return noOfFloors;
}
public void setNoOfFloors(int noOfFloors) {
	this.noOfFloors = noOfFloors;
}
public boolean isLiftAvailable() {
	return isLiftAvailable;
}
public void setLiftAvailable(boolean isLiftAvailable) {
	this.isLiftAvailable = isLiftAvailable;
}
public double getFlatPrice() {
	return flatPrice;
}
public void setFlatPrice(double flatPrice) {
	this.flatPrice = flatPrice;
}
public boolean isParkingAvailable() {
	return isParkingAvailable;
}
public void setParkingAvailable(boolean isParkingAvailable) {
	this.isParkingAvailable = isParkingAvailable;
}

}
