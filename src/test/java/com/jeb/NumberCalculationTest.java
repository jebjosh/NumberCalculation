package com.jeb;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCalculationTest {

	
	NumberCalculation nc = new NumberCalculation();
	
//	@Test
//	public void testCase1() {
//		
//		
//		assertEquals(nc.add(1, 2), 100);
//	}
	
	@Test
	public void testCase2() {
		assertEquals(nc.add(1, 2), 3);
		
	}
	

//	@Test
//	public void testCase3() {
//		
//		assertEquals(nc.add(1, 2), 10);
//	}
}
