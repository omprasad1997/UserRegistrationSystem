package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainClass {

	public static void validPhoneNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter phone number : ");
		String phoneNumber = sc.nextLine();
		if(Pattern.matches("^([0-9]{2})[\\s]([0-9]{10})$", phoneNumber))
			System.out.println("Valid phone number ");
		else    
			System.out.println("Invalid phone number ");
	}
	public static void main(String[] args) {
		validPhoneNumber();

	}

}
