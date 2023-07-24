//program to demonstrate on switching statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		  case 1:
			   System.out.println("Tum se hi");
			   break;
		  case 2:
			   System.out.println("Tum jo aaye");
			   break;
		  case 3:
			   System.out.println("Hosanna");
			   break;   
		  default:
			  System.out.println("Invalid input");
			  
			
		}

	}

}
