package com.giri.footwear;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootwearTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beanConfigurationFile = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationFile);
		Footwear footwear = container.getBean(Footwear.class);
		System.out.println(footwear.getBrand());
		System.out.println(footwear.getColor());
		System.out.println(footwear.getPrice());
		footwear.walk();
		System.out.println(footwear.getMaterial().getCloth());
		System.out.println(footwear.getMaterial().getPlastic());
		System.out.println(footwear.getMaterial().getRubber());

	}

}
