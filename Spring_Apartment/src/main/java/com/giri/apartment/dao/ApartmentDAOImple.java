package com.giri.apartment.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.giri.apartment.entity.ApartmentEntity;

@Component
public class ApartmentDAOImple implements ApartmentDAO {
	@Autowired
	private static SessionFactory factory;

	public ApartmentDAOImple(SessionFactory factory) {
		
		this.factory=factory;
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}

	public void saveEntity(ApartmentEntity flat) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(flat);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
