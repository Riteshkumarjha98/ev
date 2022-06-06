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
			
			System.out.println("username is " + customer.getUsername());
			System.out.println("mobile number is " + customer.getMobileNumber());
			System.out.println("password is " + customer.getPassword());
			System.out.println("email is " + customer.getEmail());
		}
		else {
			System.out.println("Validation error");
		}
	}
	
	static boolean inputValidation(String username,String password,String mobileNumber,String email) {
		Pattern user = Pattern.compile("[a-zA-Z]");
		Matcher u = user.matcher(username);
		
		
		Pattern pass = Pattern.compile("[a-zA-Z0-9]");
		Matcher p = pass.matcher(password);
		Pattern mob = Pattern.compile("[0-9]");
		Matcher m = mob.matcher(mobileNumber);
		Pattern em = Pattern.compile("@");
		Matcher e = em.matcher(email);
//		Pattern pass = Pattern.compile("")
		if(username.length() >= 3 && username.length() <= 8) {
			int count = 0;
			while(u.find()) {
				count++;
			}
			if(count < username.length()) {
				return false;
			}
		}
		else {
			return false;
		}
		
		if(password.length() >= 3 && password.length() <= 8) {
			int count = 0;
			while(p.find()) {
				count++;
			}
			if(count < password.length()) {
				return false;
			}
		}
		else {
			return false;
		}
		
		if(mobileNumber.length() == 10) {
			int count = 0;
			String f = Character.toString(mobileNumber.charAt(0));
			if(f != "6" || f != "7" || f != "8" || f != "9" ) {
				return false;
			}
			while(m.find()) {
				count++;
			}
			if(count < mobileNumber.length()) {
				return false;
			}
		}
		else {
			return false;
		}
		
		if(e.find()) {
			return false;
		}
		
		return true;
	}
}