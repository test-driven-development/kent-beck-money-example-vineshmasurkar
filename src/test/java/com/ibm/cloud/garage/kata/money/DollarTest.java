package com.ibm.cloud.garage.kata.money;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertThat((product.amount)).isEqualTo(10);
		product = five.times(3);
		assertThat((product.amount)).isEqualTo(15);
	}

	@Test
	public void testEquality( ) {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
	}
}