package com.ecodeup.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.ecodeup.ws.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public double operation(int operation, int val1, int val2) {
		// TODO Auto-generated method stub
		double result = 0;
		
		switch(operation) {
		case 1:
			result = val1+val2;
			break;
		case 2:
			result = val1-val2;
			break;
		case 3:
			result = val1*val2;
			break;
		case 4:
			result = val1/val2;
			break;
		default:
			break;
		}
		return result;
	}

}
