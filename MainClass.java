package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainClass {

	public static void validFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name : ");
		String firstName = sc.nextLine();
		if(Pattern.matches("^[A-Z][a-z]{2,}$", firstName))
			System.out.println("Valid fisrt name ");
		else    
			System.out.println("Invalid first name ");
	}
	public static void main(String[] args) {
		validFirstName();

	}

}
