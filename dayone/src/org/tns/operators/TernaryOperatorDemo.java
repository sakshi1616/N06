//program to demonstrate on ternary operator
package org.tns.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println("Result is: " +result);
		s.close();

	}

}
