package org.tnsif.thiskeyworddemo;
class Bank
{
   long accountNo;
   Bank(long accountNo)
   {
	  this.accountNo= accountNo;
   }
   void display()
   {
	   System.out.println(accountNo);
   }
}



public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		Bank b=new Bank(5555554564L);
		b.display();

	}

}
