package com.gamerunner.GameDesign.game.tightCoupling;

public class GameRunner {
	private MarioGame marioGame;
	private SuperContraGame superContraGame;
	/*
	 * In order to run supercontra game we need to pass the class variable ref to
	 * supercontra public GameRunner(MarioGame marioGame) { this.marioGame =
	 * marioGame; }
	 */

	public GameRunner(SuperContraGame superContraGame) {
		this.superContraGame = superContraGame;
	}

	/*
	 * public void run() { this.marioGame.up(); this.marioGame.down();
	 * this.marioGame.left(); this.marioGame.right(); }
	 */

	public void run() {
		this.superContraGame.up();
		this.superContraGame.down();
		this.superContraGame.left();
		this.superContraGame.right();
	}

}
