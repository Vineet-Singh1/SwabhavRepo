package com.monocept.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigGameJUnitTest {

	@Test
	void diceFaceValueShouldBeValid() {
		PigGame dice = new PigGame();
		int score = dice.play();
		assertTrue(score >= 0 && score <= 6);
	}

}
