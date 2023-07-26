//driver class
//program to demonstrate on default parameterized constructor

package org.tnsif.classandobjects;

public class LibraryExecutor {

	public static void main(String[] args) {
		//object creation
		Library l=new Library();
		Library ll=new Library(10,"Sanika Patil","kal ho na ho",300);
		System.out.println(ll);
	}

}
