package org.tnsif.polymorphism;
class cheifMinister
{
         static void corruption(String str1,float amount1)
         {
        	 System.out.println(str1+ " corrupted the amount of "+amount1);
         }
}
class MLA extends cheifMinister
{
	 static void corruption(String str2,float amount2)
      {
		 cheifMinister.corruption("soniya gandhi", amount2);
     	 System.out.println(str2+ " corrupted the amount of "+amount2);
      }
}
public class MethodOverriding {

	public static void main(String[] args) {
		
            MLA.corruption("sandesh mehta",6545457.00f);
	}

}
