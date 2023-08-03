package org.tnsif.thiskeyworddemo;
class Team
{
   int size;
   Team()
   {
	  this(5);
	 System.out.println("Default constructor");
   }
   Team(int size)
   {
	   System.out.println("Parameterized constructor :" +size);
   }
}


public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		Team t=new Team();
	}

}
