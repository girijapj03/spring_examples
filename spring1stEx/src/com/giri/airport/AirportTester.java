package com.giri.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		Airport fly = container.getBean(Airport.class);
		fly.runWay();
		fly.maintenance();
		System.out.println(fly);

	}

}
