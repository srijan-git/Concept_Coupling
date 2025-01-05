package com.gamerunner.GameDesign.games.springframework.refactor01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gamerunner.GameDesign.games.looseCoupling.GameRunner;
import com.gamerunner.GameDesign.games.looseCoupling.GamingConsole;

public class AppBasics01SpringContextGame {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
