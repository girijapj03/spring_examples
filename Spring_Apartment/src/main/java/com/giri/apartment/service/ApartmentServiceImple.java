package com.giri.apartment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.giri.apartment.dao.ApartmentDAO;
import com.giri.apartment.entity.ApartmentEntity;
@Component
public class ApartmentServiceImple implements ApartmentService {
@Autowired
private ApartmentDAO apartmentDao;
	public boolean validateAndSave(ApartmentEntity entity) {
		boolean check=false;
		if(entity.getName().isEmpty()&& entity.getLocation().isEmpty() ) {
			check=true;	
		}if(entity.getApartmentID() != 0 && entity.getFlatPrice() >2000 && entity.getNoOfFloors()!=0) {
			check=true;
		}
		if(check) {this.apartmentDao.saveEntity(entity);
		System.out.println("VAlidated And saved Successfully" + entity);}
		
		return check;
	}
	

}
