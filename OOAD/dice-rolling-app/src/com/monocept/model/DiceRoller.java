package com.monocept.model;

import java.util.HashMap;
import java.util.Map;

public class DiceRoller {
	public Map<Integer, Integer> roll(int times) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < times; i++) {
			int value = (int) (Math.random() * 6) + 1;
			if (result.containsKey(value))
				result.put(value, result.get(value) + 1);
			if (!result.containsKey(value))
				result.put(value, 1);

		}
		return result;
	}
}