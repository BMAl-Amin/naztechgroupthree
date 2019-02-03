package io.naztech.g3project.model;

public class Account {
	private String accountNumber;
	private String branchName;
	private String balance;
	public Account(String accountNumber, String branchName, String balance) {
		super();
		this.accountNumber = accountNumber;
		this.branchName = branchName;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", branchName=" + branchName + ", balance=" + balance + "]";
	}
	
	

}
