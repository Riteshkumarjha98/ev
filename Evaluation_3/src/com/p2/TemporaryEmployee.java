package com.p2;
public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hoursWorked;
		calculateSalary();
	}
	
	@Override
	void calculateSalary() {
		double salary = this.hourlyWages * this.hoursWorked;
		setSalary(salary);
	}
	
	
}
