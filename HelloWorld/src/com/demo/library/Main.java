package com.demo.library;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book1 = new Book("The Bird", "F. D. G", "2323423", true);
		Book book2 = new Book("The Cow", "G. D. E", "32323232", false);
		
		//Adding books to the library
		
		library.addBook(book1);
		library.addBook(book2);
		
		
		//Displaying the book
		library.displayAllBooks();
		
		library.removeBook(book2);
		library.displayAllBooks();
		
	}
}
