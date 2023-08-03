package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	String str;
	static float salary;
	
	/*static block is used to initialize static variable
	 * and we cant initialize any non static variable inside the static block
	 */
	static {
		salary=2387.67f;
		//str="BKC";
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
         /*main function is static and hence it calss static block,
          * method and variable by default
          */
	}

}
