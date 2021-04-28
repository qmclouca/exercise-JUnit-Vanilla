package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createFinancing(Long id, double totalAmount, double income, int months, double paymentsAmounts) {
		return new Financing(1L, totalAmount, income, months, paymentsAmounts);
	}
}
