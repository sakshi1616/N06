//program to demonstrate on to check the person is eligible to donate blood or not using if..else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=18 && weight>=50)
		{
			System.out.println("Eligible to donate the blood ");
		}
		else
		{
			System.out.println("Not Eligible ");
		}
	}

}
