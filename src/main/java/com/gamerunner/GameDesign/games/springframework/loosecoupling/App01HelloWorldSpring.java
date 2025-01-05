package com.gamerunner.GameDesign.games.springframework.loosecoupling;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01HelloWorldSpring {
	public static void main(String[] args) {

		/*
		 * In the looseCoupling section we are managing the classes and objects by
		 * ourselves and the by JVM only.
		 * 
		 * But now we are going to see how by the help of spring context we can manage
		 * the dependencies
		 */

		/*
		 * Now we have to create spring context so for that
		 * 
		 * 1: Create a configuration class which will include - @Configuration
		 * annotation which we want spring to manage
		 * 
		 * 2: Launch a spring context
		 */

		// Step 2 : Launch an application context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))

		{
			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("person"));

			System.out.println(context.getBean("address2"));

			System.out.println(context.getBean("personMethodCall"));

			/*
			 * Spring throws an exception indicating that multiple Beans of the specified
			 * type were found if there are multiple Beans of that type in the Spring //
			 * Context.To overcome that scenario we need to use @Primary annotation to
			 * prioritize one of the bean
			 */
			System.out.println(context.getBean(Address.class));

			System.out.println(context.getBean("personParameters"));

			// How to list all the beans names
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
