package org.tnsif.looping;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count =0;
		int num=s.nextInt();
		
		do {
		       count++;
		       num/=10;
		}while(num !=0);
		System.out.println("Total digits: "+count);
	}

}
