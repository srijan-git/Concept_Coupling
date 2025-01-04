package com.gamerunner.GameDesign.game.tightCoupling;

public class AppGameBasics {

	public static void main(String[] args) {
		MarioGame marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		/* GameRunner class is tightly coupled with superContraGame class 
		 * so, now we cannot write 
		 * var gameRunner = new GameRunner(marioGame);
		 * */
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
