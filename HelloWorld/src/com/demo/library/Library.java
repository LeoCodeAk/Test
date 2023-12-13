package com.demo.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;

	public Library() {
		books = new ArrayList<>();
	}

	public void addBook(Book newBook) {
		books.add(newBook);
		System.out.println("Book added successfully");
	}
	
	public void displayAllBooks() {
		if(books.isEmpty()) {
			System.out.println("The library has no books");
		} else {
			System.out.println("Books in the library: ");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}
	
	public void removeBook(Book bookToRemove) {
		boolean removed = books.remove(bookToRemove);
		if(removed) {
			System.out.println("Book removed successfully");
		} else {
			System.out.println("Book was not found in the library");
		}
	}
}
