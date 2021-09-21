package com.giri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.giri.apartment.dao.ApartmentDAO;

import com.giri.apartment.entity.ApartmentEntity;

public class ApartmentTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApartmentDAO dao = context.getBean(ApartmentDAO.class);
		ApartmentEntity entity = new ApartmentEntity();
		entity.setApartmentID((byte) 12);
		entity.setFlatPrice(34567);
		entity.setLiftAvailable(true);
		entity.setNoOfFloors(5);
		entity.setParkingAvailable(false);
	}

}
