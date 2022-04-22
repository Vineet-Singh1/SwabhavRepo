package com.monocept.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.com.NegativeValuesNotAllowed;
import com.monocept.com.OddEvenGenerator;

class OddEvenGeneratorTest {

	@Test
	void getEvenNosTillMethodNotReturnNull() {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] result = generator.getEvenNosTill(10);
		assertNotNull(result);
	}

	@Test
	void getEvenTilshouldGeneate5EvenNosForInput10() {
		int expectedEvenNoSize = 5;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] envos = generator.getEvenNosTill(10);
		assertTrue(envos.length == expectedEvenNoSize);
	}

	@Test
	void getEvenTillshouldGenerate5EvenNosForInput20() {
		int expectedEvenNoSize = 10;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(10);
		assertTrue(evnos.length == expectedEvenNoSize);

	}

	@Test
	void getEvenTillshouldGenerate5EvenNosForInput13() {
		int expectedEvenNoSize = 6;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10, 12 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(10);
		assertTrue(evnos.length == expectedEvenNoSize);
	}

	@Test
	void getOddNosTillShouldNotReturnNull() {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] result = generator.getOddNoTill(10);
		assertNotNull(result);
	}

	@Test
	void getOddNosTillShouldGenerate5OddNosForInput10() {
		int expectedOddNoSize = 5;
		int[] expectedOddNos = { 1, 3, 5, 7, 9 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] oddnos = generator.getOddNoTill(10);
		assertTrue(oddnos.length == expectedOddNoSize);
	}
	@Test
	void shouldThrowNotNegativeExceptionFromGetEvenNo() {
		OddEvenGenerator generator = new OddEvenGenerator();
		assertThrows(NegativeValuesNotAllowed.class, ()->generator.getOddNoTill(-11), "Failed" );
	}
}
