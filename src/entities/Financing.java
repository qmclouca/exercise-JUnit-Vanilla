package entities;

public class Financing {
	public static double MIN_FIRSTPAYMENT_PERCENTAGE = 0.20;
	
	private Long id;
	private Double totalAmount;
	private Double income;
	private Integer months;	
	private Double paymentsAmounts;
	
	public Financing() {
		
	}

	public Financing(Long id, Double totalAmount, Double income, Integer months, Double paymentsAmounts) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
		this.paymentsAmounts = paymentsAmounts;
	}

	public Long getId() {
		return id;
	}

	public Financing(Double paymentsAmounts) {
		super();
		this.paymentsAmounts = paymentsAmounts;
	}

	public Double getPaymentsAmounts() {
		return paymentsAmounts;
	}

	public void setPaymentsAmounts(Double paymentsAmounts) {
		this.paymentsAmounts = paymentsAmounts;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public boolean sufficientIncome(Double income) {
		boolean sufficientIncomeTest = false;
		if (totalAmount*MIN_FIRSTPAYMENT_PERCENTAGE <= income) {
			sufficientIncomeTest = true;
		}
		return sufficientIncomeTest;
	}
	public boolean checkIfClientRevenueIsSufficient(Double totalAmount, Double income, Integer months) {
		boolean sufficientRevenueTest = false;
		if (((totalAmount*0.8)/months) <= (income/2)) {
			sufficientRevenueTest = true;			
		} else throw new IllegalArgumentException();
		return sufficientRevenueTest;
	}
	public boolean checkInstallments(Long id, Double totalAmount, Double income, Integer months, Double paymentsAmounts) {
		boolean installmentsOkTest = false;
		if (((totalAmount*0.8)/months) <= paymentsAmounts){
			installmentsOkTest = true;
		}
		return installmentsOkTest;
	}
	
}
