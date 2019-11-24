package com.ecodeup.ws;

//wsimport -s . http://localhost:1515/WS/Calculator?wsdl
public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorImplService calculatorservice = new CalculatorImplService();
		Calculator consumer = calculatorservice.getCalculatorImplPort();
		
		System.out.println("Add");
		System.out.println(consumer.operation(1, 8, 4));
		
		System.out.println("Subtract");
		System.out.println(consumer.operation(2, 8, 4));
		
		System.out.println("Multiply");
		System.out.println(consumer.operation(3, 8, 4));
		
		System.out.println("Divide");
		System.out.println(consumer.operation(4, 8, 4));
	}
}
