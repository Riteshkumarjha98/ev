package com.p2;

public class Employee {
	
	protected  Integer emplyoeedId;
	  protected String emplyoeeName;
	 protected  double salary;
	 
	protected Integer getEmplyoeedId() {
		return emplyoeedId;
	}
	protected void setEmplyoeedId(Integer emplyoeedId) {
		this.emplyoeedId = emplyoeedId;
	}
	protected String getEmplyoeeName() {
		return emplyoeeName;
	}
	protected void setEmplyoeeName(String emplyoeeName) {
		this.emplyoeeName = emplyoeeName;
	}
	protected double getSalary() {
		return salary;
	}
	protected void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(Integer emplyoeedId, String emplyoeeName) {
		super();
		this.emplyoeedId = emplyoeedId;
		this.emplyoeeName = emplyoeeName;
	}
	
	

}
