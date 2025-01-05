package com.gamerunner.GameDesign.games.looseCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;

	/*
	 * AutoWiring using constructor injection public GameRunner(GamingConsole game)
	 * { this.game = game; }
	 */

	/* Autowiring using Qualifier */
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		this.game.up();
		this.game.down();
		this.game.left();
		this.game.right();
	}
}
