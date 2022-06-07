package com.p4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username = input.next();
		String password = input.next();
		String mobileNumber = input.next();
		String email = input.next();
		
		
		if(inputValidation(username, password, mobileNumber, email)) {
			
			Customer customer = new Customer();
			customer.setEmail(email);
			customer.setMobileNumber(mobileNumber);
			customer.setPassword(password);
			customer.setUsername(username);
			
			
			System.out.println("Username is : " + customer.getUsername());
			System.out.println("Mobile number is : " + customer.getMobileNumber());
			System.out.println("Password is : " + customer.getPassword());
			System.out.println("Email is : " + customer.getEmail());
		}
		else {
			
			System.out.println("Validation Error");
		}
	}
	
	static boolean inputValidation(String username,String password,String mobileNumber,String email) {
		
		Pattern user = Pattern.compile("[a-zA-Z]");
		Matcher us= user.matcher(username);
		
		
		Pattern pas= Pattern.compile("[a-zA-Z0-9]");
		Matcher pa = pas.matcher(password);
		
		Pattern mobile = Pattern.compile("[0-9]");
		Matcher mob = mobile.matcher(mobileNumber);
		
		Pattern Em = Pattern.compile("@");
		Matcher em = Em.matcher(email);
		

		if(username.length() >= 3 && username.length() <= 8) {
			int count = 0;
			
			while(us.find()) {
				count++;
			}
			if(count < username.length()) {
				return false;
			}
		}
		else 
		{
			return false;
		}
		
		if(password.length() >= 3 && password.length() <= 8) {
			int count = 0;
			
			
			while(pa.find()) {
				count++;
			}
			if(count < password.length()) {
				return false;
			}
		}
		else {
			
			return false;
		}
		

	if(em.find()) {
			return false;
		}
		
		return true;
	}
}