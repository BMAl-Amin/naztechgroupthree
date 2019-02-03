package io.naztech.g3project.model;

public class Employee {
	private String employeeName;
	private String branchName;
	private double salary;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String employeeName, String branchName, double salary) {
		super();
		this.employeeName = employeeName;
		this.branchName = branchName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", branchName=" + branchName + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
	}
	
	

}
