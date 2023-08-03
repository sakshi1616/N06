package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		SBI s= new SBI();
		s.setAccType("Saving Account");
		s.setAccountNo(78465851548L);
		s.setAtmCardNo(55125454254L);
		s.setPinNo(1111);
		
		//line will call to toString() method
		System.out.println(s);
	}

}
