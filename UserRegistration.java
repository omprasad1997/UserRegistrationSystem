package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

interface validateUserEntry{
	public String checkEntry(String userEntry);
}

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		validateUserEntry firstName =  (userEntry)->{
			if(Pattern.matches("^[A-Z][a-z]{2,}$", userEntry))
				return "Valid";
			else 
				return "Invalid";
		};
		
		validateUserEntry lastName =  (userEntry)->{
			if(Pattern.matches("^[A-Z][a-z]{2,}$", userEntry))
				return "Valid";
			else 
				return "Invalid";
		};
		
		validateUserEntry email =  (userEntry)->{
			if(Pattern.matches("^(abc)?(.+)@(.+)([.](com))?([^.])$", userEntry))
				return "Valid";
			else 
				return "Invalid";
		};
		
		validateUserEntry mobileNumber =  (userEntry)->{
			if(Pattern.matches("^([0-9]{2})[\\s]([0-9]{10})$", userEntry))
				return "Valid";
			else 
				return "Invalid";
		};
		
		validateUserEntry password =  (userEntry)->{
			if(Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])).{8,}", userEntry))
				return "Valid";
			else 
				return "Invalid";
		};
		
		System.out.println("First Name is "    + firstName.checkEntry("Omprasad"));
		System.out.println("Last Name is "     + lastName.checkEntry("rathod"));
		System.out.println("Email address is " + email.checkEntry("abc.xyz@yahoo.com.au"));
		System.out.println("Mobile Number is " + mobileNumber.checkEntry("916542378996"));
		System.out.println("Password is "      + password.checkEntry("Omprasad@123"));
	}
}
