//program to demonstrating on static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
     
	 String str="BKC";
	 static float percentage=89.2f;
	 
	/*if any method is outside the main function and we want to access it
	 *  then make it as static
	 */
	static void displayScore(int Score)
	{
		System.out.println(percentage);
		System.out.println("Score is: "+Score);
	}
	public static void main(String[] args) {
		displayScore(56);
	}

}
