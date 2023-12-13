package com.demo.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Operators operator = new Operators();
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit) {
			
			try { 
		
				System.out.println("Welcome to the calculator application! ");
				System.out.print("Options: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit \n Pick one of the options: ");
				int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				operator.addition(scanner);
				
			} else if(userChoice == 2) {
				operator.subtraction(scanner);
			} else if(userChoice == 3) {
				operator.multiplication(scanner);
			} else if(userChoice == 4) {
				operator.division(scanner);
			} else if(userChoice == 5)  {
				System.out.println("You have exited out the program!");
				exit = true;
			} else {
				System.out.println("You have entered invalid number. Try again: ");
			}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input");
				scanner.next();
			}
		}
	}
}
