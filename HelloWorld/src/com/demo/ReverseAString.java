package com.demo;

import java.util.Scanner;

public class ReverseAString {

	
	public static void main(String[] args) {

			/*
		// Storing each character to the front of the word in a loop to get the reverse String
		
		String string = "Akash is awesome"; //Defines a string
		String reversedString = ""; //Creates an empty string to store reverse word
		System.out.println("Original word: " + string); // Print the original word
		char ch; // Creates character variable for char
		
		// Iterates through each of the characters in the string
		for(int i =0; i <string.length(); i++) {
			//Retrieves each character at index i
			ch = string.charAt(i);
			//Concatenates current character with the existing reversed string
			reversedString = ch + reversedString;
		}
		System.out.println("Reverse word: " + reversedString);
				*/
		
		// ---------------------------------------------------------------------------------------------------------------------------------------------
		
		//String builder 
		/*
		String string = "Geeks for Geeks";
		StringBuilder stringBuilderString = new StringBuilder();
		
		stringBuilderString.append(string);
		
		stringBuilderString.reverse();
		System.out.println("Original String: " + string);
		System.out.println("Reversed String: "+ stringBuilderString);
		
		*/
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Converting the String to character Array: The user input the string to be reversed
		
		String theString = "Akash is reversed";
		char[] toArray = theString.toCharArray();
		
		for(int i = toArray.length -1; i >= 0; i--) {
			System.out.print(toArray[i]);
		}
	}
}
