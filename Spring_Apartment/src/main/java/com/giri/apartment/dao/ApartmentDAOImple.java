package com.giri.apartment.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.giri.apartment.entity.ApartmentEntity;

public class ApartmentDAOImple implements ApartmentDAO{
private static SessionFactory factory;
public ApartmentDAOImple() {
	super();
	System.out.println(this.getClass().getSimpleName()+"bean created");
}
	public void setApartmentEntity(ApartmentEntity flat) {
		Session session =null;
		try {session=factory.openSession();
		session.beginTransaction();
		session.save(flat);
		session.getTransaction().commit();
			
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if(session !=null) {
				session.close();
			}
		}
	}

}
