package com.demo.library;

public class Book {

	String title;
	String author;
	String ISBN;
	boolean availability;
	
	public Book( ) {
		
	}

	public Book(String title, String author, String iSBN, boolean availability) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.availability = availability;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Book: " + title + " by: " + author + " Book Number: " + ISBN + " Still available? " + availability;
	}
	
	
	
	
	
}
