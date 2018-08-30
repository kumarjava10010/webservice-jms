package com.newfeatures.Java18;

public class InterestCalcFunctionalImpl implements InterestCalcFunctionaIfc{

	@Override
	public double interestAmount(double amount, double interest) {
		double i = amount*interest;
		return i;
	}

}
