package com.p3;

public class Demo {
	public static void main(String[] args) {
		Demo demo = new Demo();	
		Month m = Month.JAN;
		demo.showDetails(m);
	}
	void showDetails(Month m) {
		try {
			switch(m) {
				case JAN:
			System.out.println("This is 1st the month of the year January");
				break;
				case FEB:
			System.out.println("This is 2nd the month of the year February");
				break;
				case MAR:
			  System.out.println("This is 3rd the month of the year March");
				break;
				case APR:
			System.out.println("This is 4th the month of the year April");
		     	break;
				case MAY:
		  System.out.println("This is 5th the month of the year May");
				break;
				case JUN:
          System.out.println("This is 6th the month of the year June");
				break;
				case JUL:
		  System.out.println("This is 7th the month of the year July");
				break;
				case AUG:
		 System.out.println("This is 8th the month of the year August");
				break;
				case SEP:
		System.out.println("This is 9th the month of the year September");
				break;
				case OCT:
	   System.out.println("This is 10th the month of the year October");
				break;
				case NOV:
		System.out.println("This is 11th the month of the year November");
				break;
				case DEC:
		System.out.println("This is 12th the month of the year December");
				break;
			}
		}
		catch(Exception Exeception){
			System.out.println("Invalid month");
		}
	}
		
}