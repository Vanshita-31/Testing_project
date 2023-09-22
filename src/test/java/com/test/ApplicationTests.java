package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	Calculator calculator = new Calculator();
	
	@Test
	void testadd()
	{
		int expectedResult = 10;
		int actualResult = calculator.add(5, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	
	@Test
	void testmul()
	{
		int expectedResult = 20;
		int actualResult = calculator.mul(4, 5);
		
		assertEquals(expectedResult, actualResult);
	}
}
