package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	//First test
	@Test
	public void firstPaymentShouldBeGreaterThanTwentyPercentOfTheTotalAmount() {
		//Arrange
		long id = 1L;
		boolean expectedValue = true;
		double totalAmount = 1000.00;
		double income = 200.00;
		int months = 20;
		Financing fin = FinancingFactory.createFinancing(id, totalAmount, income, months);
		//Act
		boolean result = fin.sufficientIncome(income);
		//Assert
		Assertions.assertTrue(result == expectedValue);
	}
}
