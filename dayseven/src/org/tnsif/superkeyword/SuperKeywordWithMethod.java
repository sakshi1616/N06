package org.tnsif.superkeyword;
class MET
{
    String owner="Chhagan Bhujbal";
    void displayName()
    {
    	System.out.println("Owner is :"+owner);
    }
}

class BKC extends MET
{
	  String owner="Shefali Bhujbal";
	    void displayName()
	    {   
	    	//if parent and child class method name are same and if u want to access that method then use super. method name
	    	super.displayName();
	    	System.out.println("Owner is :"+owner);
	    }
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
		 BKC b=new BKC();
		 b.displayName();
	}

}
