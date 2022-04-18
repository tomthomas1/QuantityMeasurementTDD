package com.bridgelabz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;

public class QuantityTest {

	@Test
	public void compareLength_WhenCorrect_ShouldReturnTrue() {
		Quantity quantity = new Quantity();
		boolean check = quantity.compareLength(1, 12);
		assertTrue(check);
	}

	@Test
	public void compareLength_WhenWrong_ShouldReturnFalse() {
		Quantity quantity = new Quantity();
		boolean check = quantity.compareLength(2, 12);
		assertFalse(check);
	}
	
}
