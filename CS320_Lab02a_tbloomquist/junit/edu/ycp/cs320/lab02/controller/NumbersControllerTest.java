package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a.controller.NumbersController;
import edu.ycp.cs320.lab02a.model.GuessingGame;

public class NumbersControllerTest {
	private NumbersController controller;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
	}
	
	@Test
	public void testAddition() {
		double num = controller.add(1.0, 3.0);
		assertTrue(num-4==0);
	}
	@Test
	public void testMultiplication() {
		double num = controller.product(1.0, 3.0);
		assertTrue(num-3==0);
	}
}
