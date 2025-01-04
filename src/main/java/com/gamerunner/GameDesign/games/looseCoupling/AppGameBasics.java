package com.gamerunner.GameDesign.games.looseCoupling;

public class AppGameBasics {
	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
