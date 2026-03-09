package com.kodewish;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTestCase {
	
	@BeforeEach
	public void displayEachCase() {
		System.out.println("printing for each case");
	}

    @Test
    public void checkPositive() {
        CalculatorApp calculatorApp = new CalculatorApp();
        //test with passing +ve nmb
        int actualRes = calculatorApp.product(2, 2);
        int expectedRes = 4;
        assertEquals(expectedRes, actualRes);
    }
    
    
    @Test
    public void checkNegative() {
        CalculatorApp calculatorApp = new CalculatorApp();
        //test with passing -ve nmb
        int actualRes = calculatorApp.product(-2, 6);
        int expectedRes = -12;
        assertEquals(expectedRes, actualRes);
    }
    
}