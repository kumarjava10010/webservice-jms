package com.newfeatures.Java18;

public class InterestCalcFuctionalTest {

	public static void main(String args[]) {
		double principal = 10000.00;
		double interest = 0.03;
		
		
		InterestCalcFunctionaIfc ifc = new InterestCalcFunctionalImpl();
		
		double interestAmount = ifc.interestAmount(principal, interest);
		
		System.out.println("Interface Example : "+interestAmount);
		

		// lambda expression to define the calculate method
		InterestCalcFunctionaIfc s = (double p, double i) -> {return p * i;};

		// parameter passed and return type must be
		// same as defined in the prototype
		double ans = s.interestAmount(principal, interest);
		System.out.println(ans);

		// lambda expression to define the calculate method
		InterestCalcFunctionaIfc s1 = (double p, double i) -> {
			System.out.println("This example with curly braces");
			return p * i*2;
		};

		double interestFor2Y = s1.interestAmount(principal, interest);
		System.out.println(interestFor2Y);
	}

}
