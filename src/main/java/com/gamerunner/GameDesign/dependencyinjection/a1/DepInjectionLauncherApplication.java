package com.gamerunner.GameDesign.dependencyinjection.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//YourBusinessClass
//Dependency-1
//Dependency-2

@Component
class YourBusinessClass {

	Dependency1 dependency1;

	Dependency2 dependency2;

	/*
	 * Constructor Injection
	 * 
	 * @Autowired -- Is not compulsory here public YourBusinessClass(Dependency1
	 * dependency1, Dependency2 dependency2) { super();
	 * System.out.println("Constructor Injection - YourBusinessClass");
	 * this.dependency1 = dependency1; this.dependency2 = dependency2; }
	 */
	/*
	 * Field Dependency Injection
	 * 
	 * @Autowired Dependency1 dependency1;
	 * 
	 * @Autowired Dependency2 dependency2;
	 */

	/*
	 * Setter Dependency Injection
	 * 
	 * @Autowired public void setDependency1(Dependency1 dependency1) {
	 * System.out.println("Setter Injection - setDependency 1"); this.dependency1 =
	 * dependency1; }
	 * 
	 * @Autowired public void setDependency2(Dependency2 dependency2) {
	 * System.out.println("Setter Injection - setDependency 2"); this.dependency2 =
	 * dependency2; }
	 */

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}

}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}
