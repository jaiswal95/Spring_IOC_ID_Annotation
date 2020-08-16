package com.pankaj.SpringDemo;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// Load the Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

		// Retrieve Bean from Container
		Coach theCoach = context.getBean("volleyBallCoach", Coach.class);

		Coach alphaCoach = context.getBean("volleyBallCoach", Coach.class);

		// Check if they are Same
		boolean result = (theCoach == alphaCoach);

		// Print out the Result
		System.out.println("\nPointing to a Same Object: " + result);

		System.out.println("Memory Location of theCoach: " + theCoach);

		System.out.println("Memory Location of alphaCoach: " + alphaCoach + "\n");

		// Close the context
		context.close();

	}

}
