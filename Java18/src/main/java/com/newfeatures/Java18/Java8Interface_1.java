package com.newfeatures.Java18;

public interface Java8Interface_1 {
    
	default void hi() {
        System.out.println("In Java8Interface_1: new feature of Java8 is saying Hi....");
    }
    static void hello() {
        System.out.println("In Java8Interface_1: new feature of Java8 is saying Hello....");
    }
}