package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import testing.carCalcTest;

class carCalcTest {

	@Test
	public void monthlyPaymentTest1() {
		double CarCost = 35000.0;
		double DownPayment = 0.0;
		int LengthOfLoan = 60;
		double InterestRate = 10;
		
		assertTrue(monthlyCarPayment(),743.65,0.01);
	}
	@Test
	public void InterestSpentTest() {
		double CarCost = 35000.0;
		double DownPayment = 0.0;
		int LengthOfLoan = 60;
		double InterestRate = 10;
		
		assertTrue(InterestSpent(), 9619.00,0.01);
	}
	
	}