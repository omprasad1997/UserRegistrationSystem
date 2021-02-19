package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainClass {

	public static void validPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		if(Pattern.matches("^((.+){8,})$", password))
			System.out.println("Valid password ");
		else    
			System.out.println("Invalid password ");
	}
	public static void main(String[] args) {
		validPassword();

	}

}
