package com.pankaj.SpringDemo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// Load the Spring Configuration Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

		// Retrieve the bean from Spring Container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// Coach theCoach = context.getBean("footballCoach", Coach.class);

		// Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// Call the method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		System.out.println("Email: " + theCoach.getEmail());

		System.out.println("Team: " + theCoach.getTeam());

		// Close the context
		context.close();

	}

}
