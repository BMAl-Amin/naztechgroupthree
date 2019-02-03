package io.naztech.g3project.model;

public class Customer {
	public int id;
	private String customerId;
	private String customerName;
	private String customerStreet;
	private String customerCity;
	public Customer(String customerId, String customerName, String customerStreet, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
	}
	public Customer() {
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
	public String getCustomerStreet() {
		return customerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerStreet="
				+ customerStreet + ", customerCity=" + customerCity + "]";
	}
	
	
	

}
