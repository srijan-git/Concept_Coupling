package com.gamerunner.GameDesign.games.springframework.loosecoupling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Eliminate verbosity in creating Java Beans. (Getters and setters)
 * Public accessor methods,constructor
 * equals, hascode and toString are automaticallu created.
 * Released in JDK 16.
 * */

record Person(String name, int age) {
};

record Address(String firstLine, String city) {
}

//Step 1: Create a configuration file
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Srijan";
	}

	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		return new Person("Jhon", 20);
	}

	// Creating a new spring bean with the relationship with existing spring beans -
	// by method call
	// AutoWiring by method call
	@Bean
	public Person personMethodCall() {
		return new Person(name(), age());
	}

	// AutoWiring by Parameters
	@Bean
	public Person personParameters(String name, int age) {
		return new Person(name, age);
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("New York", "Connecticut");
	}
}
