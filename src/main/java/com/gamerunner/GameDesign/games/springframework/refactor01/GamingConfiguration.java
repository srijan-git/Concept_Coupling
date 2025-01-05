package com.gamerunner.GameDesign.games.springframework.refactor01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gamerunner.GameDesign.games.looseCoupling.GameRunner;
import com.gamerunner.GameDesign.games.looseCoupling.GamingConsole;
import com.gamerunner.GameDesign.games.looseCoupling.PacManGame;
@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
