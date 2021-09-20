package com.giri.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FruitTester {

	public static void main(String[] args) {
		String beanConfFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfFile);
		
		Fruit fruit = context.getBean(Fruit.class);
		System.out.println(fruit.name);		
		System.out.println(fruit.color);
		System.out.println(fruit.price);
		System.out.println(fruit.tasty);
		
        System.out.println(fruit.vitamin.type);
		System.out.println(fruit.vitamin.waterSoluble);
		System.out.println(fruit.vitamin.fatSoluble);
		fruit.provideEnergy();
	}

}
