package com.pankaj.SpringDemo;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

		// Retrieve the bean from Spring Container
		Coach theCoach = context.getBean("volleyBallCoach", Coach.class);

		// Coach theCoach = context.getBean("footballCoach", Coach.class);

		// Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// Call the method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// Close the context
		context.close();

	}

}
