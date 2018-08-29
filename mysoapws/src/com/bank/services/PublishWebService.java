package com.bank.services;

import javax.xml.ws.Endpoint;

public class PublishWebService {

	public static void main(String[] args) {
		System.out.println("This is my Banking Services : Started");

		Endpoint.publish("http://localhost:8888/ws/account", new BankServiceImpl());  
		
		System.out.println("This is my Banking Services : Ended");

	}

}
