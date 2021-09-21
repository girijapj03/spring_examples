package com.giri.apartment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.giri.apartment.dao.ApartmentDAO;

import com.giri.apartment.entity.ApartmentEntity;
import com.giri.apartment.service.ApartmentService;
import com.giri.apartment.service.ApartmentServiceImple;
@Component
public class ApartmentTester {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("spring.xml");
		//ApartmentDAO dao = con.getBean(ApartmentDAO.class);
		ApartmentService service= con.getBean(ApartmentService.class);
		ApartmentEntity entity = new ApartmentEntity();
		entity.setName("Paradise");
		entity.setLocation("Badami");
		entity.setApartmentID((byte) 12);
		entity.setFlatPrice(34567);
		entity.setLiftAvailable(true);
		entity.setNoOfFloors(5);
		entity.setParkingAvailable(false);
		boolean serviceCheck=service.validateAndSave(entity);
		if(!serviceCheck) {
			System.out.println("Data is not valid,please check the data");
		}else {
			System.out.println("**entity is Saved**");
		}
	}

}
