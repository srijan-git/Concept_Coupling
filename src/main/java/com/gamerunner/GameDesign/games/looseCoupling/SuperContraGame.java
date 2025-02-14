package com.gamerunner.GameDesign.games.looseCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContraGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Up!");
	}

	@Override
	public void down() {
		System.out.println("Sit down!");
	}

	@Override
	public void left() {
		System.out.println("Go back!");
	}

	@Override
	public void right() {
		System.out.println("Shoot a bullet!");
	}
}
