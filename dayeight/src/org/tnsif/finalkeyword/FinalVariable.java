//program to demonstrate on final variable
package org.tnsif.finalkeyword;
public class FinalVariable {

	//final variable must be initialized during ddeclaration
	//final int x;
	
	final float Salary=6549.00f;
	
	void print()
	{
		//we can't change the value of final variable
		//Salary=8900.00f;
		System.out.println("Salary is : "+Salary);
	}
}
