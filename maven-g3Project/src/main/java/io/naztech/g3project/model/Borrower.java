package io.naztech.g3project.model;

public class Borrower {
	
	private String customerId;
	private String customerName;
	private String loanNumber;
	public Borrower(String customerId, String customerName, String loanNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanNumber = loanNumber;
	}
	public Borrower() {
		super();
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	@Override
	public String toString() {
		return "Borrower [customerId=" + customerId + ", customerName=" + customerName + ", loanNumber=" + loanNumber
				+ "]";
	}

	
}
