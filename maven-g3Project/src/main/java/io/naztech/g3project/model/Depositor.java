package io.naztech.g3project.model;

public class Depositor {
	private String customerId;
	private String customerName;
	private String accountNumber;
	public Depositor(String customerId, String customerName, String accountNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
	}
	public Depositor() {
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
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Depositor [customerId=" + customerId + ", customerName=" + customerName + ", accountNumber="
				+ accountNumber + "]";
	}
	
	
}
