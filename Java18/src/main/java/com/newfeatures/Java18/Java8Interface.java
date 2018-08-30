package com.newfeatures.Java18;

public interface Java8Interface {
	
	public void bye();

	// defaults method - by default it's public
	default void hi() {
		System.out.println("In Java8Interface: new feature of Java8 is saying Hi....");
	}

	// static method - by default it's public
	static void hello() {
		System.out.println("In Java8Interface: new feature of Java8 is saying Hello....");
	}
  
}
