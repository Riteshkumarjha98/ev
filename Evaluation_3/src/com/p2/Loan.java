package com.p2;

public class Loan {
	
	private Loan(){
		
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount = 0;
		if(employeeObj != null) {
			if(employeeObj instanceof PermanentEmployee) {
				loanAmount = employeeObj.getSalary()*0.15;
			}
			else if(employeeObj instanceof TemporaryEmployee) {
				loanAmount = employeeObj.getSalary()*0.10;
			}
			System.out.println(loanAmount);
		}
		else {
			System.out.println("value is null");
		}
		
		return loanAmount;
	}
	
	
}