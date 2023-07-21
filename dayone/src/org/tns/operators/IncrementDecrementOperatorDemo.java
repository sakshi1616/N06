//program to demonstare on increment and decrement operator
package org.tns.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
	 int x=20,y=5;
	 int result= x++ + ++y;
	 System.out.println(result);
	 System.out.println(x);
	 System.out.println(y);
	 
	 int result1= x-- + --y;
	 System.out.println(result1);
	 System.out.println(x);
	 System.out.println(y);
	 
	}

}
