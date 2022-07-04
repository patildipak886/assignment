package com.app;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain extends TestCase{
	
	@Test
	public void testInputIsEven(){
	assertTrue(Main.checkIfInputIsAnEvenNumber(22));

}
}