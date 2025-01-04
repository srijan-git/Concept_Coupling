package com.gamerunner.GameDesign.games.looseCoupling;

public class GameRunner {
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		this.game.up();
		this.game.down();
		this.game.left();
		this.game.right();
	}
}
