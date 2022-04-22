package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.monocept.model.DiceRoller;

class DiceRollerJUnitTest {

	@Test
	void checkDiceResultTest() {
		DiceRoller dice = new DiceRoller();

		Map<Integer, Integer> result = dice.roll(10);
		int sum = 0;
		for (Integer key : result.keySet())
			sum = sum + result.get(key);
		assertEquals(sum, 10);
	}

}
