package com.newfeatures.Java18;

public class Java8InterfaceImpl implements Java8Interface, Java8Interface_1 {

	public static void main(String[] args) {
		Java8InterfaceImpl c = new Java8InterfaceImpl();
		c.hi();
		// would be accessible using class instance
		// Not possible to call using class instance
		Java8Interface.hello();
		c.bye();
	}
	
	

	@Override
	public void bye() {
		System.out.println("Bye");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		Java8Interface_1.super.hi();
	}

}
