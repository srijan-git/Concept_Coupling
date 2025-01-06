package com.gamerunner.GameDesign.dependencyinjection.a2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Singleton
@Component
class NormalClass {
}

//Prototype
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {

			// One object instance per Spring IoC container
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			// Possibly many object instances per Spring IoC container
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	}
}
