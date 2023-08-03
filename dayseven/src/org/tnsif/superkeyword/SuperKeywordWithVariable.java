package org.tnsif.superkeyword;
//program to demonstrate on super keyword with variable
class Building
{
    int floors=25;
    String name="Sai-Hostel";
}

class Flat extends Building
{
	String name="Riya Patil";
	
	void print()
	{
		/*if parent class and child class variable name are same and if u want to access parent class
		variable inside */
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
	    System.out.println(f.name);
	    f.print();

	}

}
