package io.naztech.g3project.model;

public class Branch {
	private String branchName;
	private String branchCity;
	private double assets;
	public Branch(String branchName, String branchCity, double assets) {
		super();
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.assets = assets;
	}
	public Branch() {
		super();
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	public double getAssets() {
		return assets;
	}
	public void setAssets(double assets) {
		this.assets = assets;
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", branchCity=" + branchCity + ", assets=" + assets + "]";
	}
	
	

}
