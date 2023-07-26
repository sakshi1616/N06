//program to demonstrate on default parameterized constructor
package org.tnsif.classandobjects;

public class Library {
     
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	public Library() {
		System.out.println("Default Constructor");
		
	}
	
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
}
