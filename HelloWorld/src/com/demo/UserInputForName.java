package com.demo;

import java.util.Scanner;

public class UserInputForName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.print("Your name is: " + name);
		
		scanner.close();
	}
}
