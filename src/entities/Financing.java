package entities;

public class Financing {
	public static double MIN_FIRSTPAYMENT_PERCENTAGE = 0.20;
	
	private Long id;
	private Double totalAmount;
	private Double income;
	private Integer months;	
	
	public Financing() {
		
	}

	public Financing(Long id, Double totalAmount, Double income, Integer months) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Long getId() {
		return id;
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
}
