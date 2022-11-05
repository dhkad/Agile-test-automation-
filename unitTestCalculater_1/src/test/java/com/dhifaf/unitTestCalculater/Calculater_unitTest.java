package com.dhifaf.unitTestCalculater;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class Calculater_unitTest {

    Calc_methods CM= null;

	@Before
	public void setUp() {
		CM=new Calc_methods();
	}

	@Test
	public void test_add() {
		assertEquals(2,CM.add(1, 1));
	}
	@Test
	public void test_subtract() {
		assertEquals(0,CM.substract(1,1));
	}
	@Test
	public void test_multiply() {
		assertEquals("Muliplication is not correct",1,CM.multiply(1, 1));
	}
	
	
	@Test
	public void test_divide() {
		
		
		assertEquals(1,CM.divide(1, 1),0.01f);
	}
	
	@Test
	public void test_mod() {
		assertEquals(1,CM.mod(1, 2));
	}

}
