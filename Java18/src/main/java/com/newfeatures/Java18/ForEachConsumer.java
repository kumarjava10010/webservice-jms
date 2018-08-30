package com.newfeatures.Java18;

import java.util.function.Consumer;

//Consumer implementation that can be reused
class ForEachConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
		
		//Connect to DB
		//Insert Data
		//Do ssome Business logic 
		
	}

}