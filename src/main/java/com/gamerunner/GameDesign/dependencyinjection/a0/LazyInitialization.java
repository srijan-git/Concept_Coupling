package com.gamerunner.GameDesign.dependencyinjection.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import com.gamerunner.GameDesign.games.looseCoupling.GameRunner;
import com.gamerunner.GameDesign.games.springframework.refactor02.GamingAppLauncherApplication;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Class B is already iniltialized");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Do something");
	}
}

@Configuration
@ComponentScan
public class LazyInitialization {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitialization.class)) {
			System.out.println("Initializtion of the Spring Context is completed");
			context.getBean(ClassB.class).doSomething();
		}
	}
}
