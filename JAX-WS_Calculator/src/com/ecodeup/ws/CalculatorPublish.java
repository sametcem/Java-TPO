package com.ecodeup.ws;

import javax.xml.ws.Endpoint;

public class CalculatorPublish {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1515/WS/Calculator", new CalculatorImpl());
	}
}	
