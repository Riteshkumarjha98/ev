package com.p2;

public class TemporaryEmployee extends Employee  {
	private  Integer hoursWorked;
     private Integer hourlyWages;
	
     
     public TemporaryEmployee(Integer emplyoeedId, String emplyoeeName, Integer hoursWorked, Integer hourlyWages) {
		super(emplyoeedId, emplyoeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
     

}
