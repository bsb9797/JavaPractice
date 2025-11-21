package com.maven;

public class Employee {
	
	private String empNmae;
	private int empId;
	private String desg;
	private String mobileNum;
	public Employee(String empNmae, int empId, String desg, String mobileNum) {
		super();
		this.empNmae = empNmae;
		this.empId = empId;
		this.desg = desg;
		this.mobileNum = mobileNum;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "Employee [empNmae=" + empNmae + ", empId=" + empId + ", desg=" + desg + ", mobileNum=" + mobileNum
				+ "]";
	}
	
}
