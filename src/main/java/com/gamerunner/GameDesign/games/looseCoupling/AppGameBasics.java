package com.gamerunner.GameDesign.games.looseCoupling;

public class AppGameBasics {
	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame(); //Object Creation
		var gameRunner = new GameRunner(game);
		//2: Object Creation + Wiring of Dependencies
		//game is dependency of GameRunner
		gameRunner.run();
	}

}
