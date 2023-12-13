package com.demo.calculator;

import java.util.Scanner;

public class Operators {

	public void addition(Scanner scanner) {
		System.out.print("Enter your first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter your second number: ");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;
		System.out.println("Your number added together is: " + sum);
	}
	
	public void subtraction(Scanner scanner) {
		System.out.print("Enter your first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter your second number: ");
		int number2 = scanner.nextInt();
		int sub = number1 - number2;
		System.out.println("Your number subtracted together is: " + sub);
	}
	
	public void multiplication(Scanner scanner) {
		System.out.print("Enter your first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter your second number: ");
		int number2 = scanner.nextInt();
		int multiply = number1 * number2;
		System.out.println("Your number multiplied together is: " + multiply);
	}
	
	public void division(Scanner scanner) {
		System.out.print("Enter your first number: ");
		float number1 = scanner.nextInt();
		System.out.print("Enter your second number: ");
		float number2 = scanner.nextInt();
		float divide = number1 / number2;
		System.out.println("Your number divided together is: " + divide);
	}
}
