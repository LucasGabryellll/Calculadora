package model;

import view.ScreenCalculator;

public class Operation {

	public int valueOne, valueTwo;
	
	public static int operation(int values[], String signal) {
		
		int result = 0;
		
		if(signal == "+") {
			result = values[0] + values[1];

		}
		
		if (signal == "-") {
			result = values[0] - values[1];

		}
		
		if (signal == "*") {
			result = values[0] * values[1];

		}
		
		if (signal == "/") {
			result = values[0] / values[1];

		}
		return result;
	}
	
}
