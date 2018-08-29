package com.mq;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class CheckDepositReceiver {

	// URL of the JMS server. DEFAULT_BROKER_URL will just mean that JMS server is
	// on localhost
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

	public static void main(String[] a) {

		try {
			// Getting JMS connection from the server and starting it
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

			// Create a Connection
			Connection connection = connectionFactory.createConnection();
			connection.start();

			// Creating a non transactional session to send/receive JMS message
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// Destination represents here our queue 'JCG_QUEUE' on the JMS server.
			// The queue will be created automatically on the server.

			Destination destination = session.createQueue("TEST.FOO");

			// MessageConsumer is used for receiving (consuming) messages
			MessageConsumer consumer = session.createConsumer(destination);

			// Here we receive the message.
			Message message = consumer.receive();

			// We will be using TestMessage in our example. MessageProducer sent us a
			// TextMessage
			// so we must cast to it to get access to its .getText() method.
			if (message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage) message;
				System.out.println("Received message '" + textMessage.getText() + "'");
			}
			connection.close();

		} catch (Exception e) {
			System.out.println("Caught: " + e);
			e.printStackTrace();
		}

	}

}
