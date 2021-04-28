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
		double paymentsAmounts = 10;
		Financing fin = FinancingFactory.createFinancing(id, totalAmount, income, months, paymentsAmounts);
		//Act
		boolean result = fin.sufficientIncome(income);
		//Assert
		Assertions.assertTrue(result == expectedValue);
	}
	//Second Test
	@Test
	public void paymentAmountsShouldBeLessThanHalfOfTheCustomersRevenue() {
		//Arrange
		long id = 1L;
		boolean expectedValue = true;
		double totalAmount = 1000.00;
		double income = 200.00;
		int months = 8;
		double paymentsAmounts = 10;
		Financing fin = FinancingFactory.createFinancing(id, totalAmount, income, months, paymentsAmounts);
		//Act
		boolean result = fin.checkIfClientRevenueIsSufficient(totalAmount, income, months);
		//Assert
		Assertions.assertTrue(result == expectedValue);
	}
	//Third Test
	@Test
	public void paymentAmountsShouldBeLessThanEightyPercentOfTheTotalAmountDividedByTheNumberOfInstallments() {
		//Arrange
		long id = 1L;
		boolean expectedValue = true;
		double totalAmount = 1000.00;
		double income = 200.00;
		int months = 10;
		double paymentsAmounts = 80;
		Financing fin = FinancingFactory.createFinancing(id, totalAmount, income, months, paymentsAmounts);
		//Act
		boolean result = fin.checkInstallments(id, totalAmount, income, months, paymentsAmounts);
		//Assert
		Assertions.assertTrue(result == expectedValue);		
	}
}
