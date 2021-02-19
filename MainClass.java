package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainClass {

	public static void validEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email : ");
		String email = sc.nextLine();
		if(Pattern.matches("^(abc)?(.+)@(bl)([.](co))?([.][a-z]{2})$", email))
			System.out.println("Valid email ");
		else    
			System.out.println("Invalid email ");
	}
	public static void main(String[] args) {
		validEmail();

	}

}
