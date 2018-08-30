package com.newfeatures.Java18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {

		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		// traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}
		
		for(int i = 0 ; i<myList.size() ; i++) {
			System.out.println("OLd Style : "+myList.get(i));
			//Connect to DB
			//Insert Data
			//Do ssome Business logic 
		}
		
		for (Integer obj : myList) {
			
			System.out.println("For Each before 1.7 "+obj);
			
			//Connect to DB
			//Insert Data
			//Do ssome Business logic 
			
		}

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::" + t);
			}

		});

		// traversing with Consumer interface implementation
		ForEachConsumer action = new ForEachConsumer();
		
		myList.forEach(action);

	}

}