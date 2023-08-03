package org.tnsif.instanceofdemo;
class RBI
{
  protected String ifscCode="RBIS00000";
   
}
class SBI extends RBI
{
   public SBI() {
	   super.ifscCode="RBIS00000";
    	String ifscCode="SBIN0002161";
    	System.out.println(ifscCode);
    	/*if parent class and child class variable name are same ,in such case,use super.variable 
    	 * to access variable of parent class inside the child class
    	 */
    	System.out.println(super.ifscCode);
   
}}
public class InstanceOfDemo {

	public static void main(String[] args) {
		
         SBI s=new SBI();
         System.out.println(s instanceof SBI );
         System.out.println(s instanceof RBI );
	}

}
