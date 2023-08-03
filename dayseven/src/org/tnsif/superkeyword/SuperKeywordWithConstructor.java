package org.tnsif.superkeyword;

class Google
{
    String ceo;
    
    public Google(String ceo) {
    	System.out.println("Default constructor: "+ceo);
    }
}

class Gmail extends Google
{
	String userid;

	public Gmail(String ceo, String userid) {
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	

}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
	
              Gmail g=new Gmail("Sundar Pichai","abc@gmail.com");
	}

}
