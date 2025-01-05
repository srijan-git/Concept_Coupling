package com.gamerunner.GameDesign.games.springframework.refactor02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gamerunner.GameDesign.games.looseCoupling.GameRunner;

@Configuration
@ComponentScan("com.gamerunner.GameDesign.games.looseCoupling")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GameRunner.class).run();
		}
	}
}
