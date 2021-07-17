package app;

import controller.ControllerCalculato;
import model.Operation;
import view.ScreenCalculator;

public class App3 {
	public static void main(String[] args) {
		ScreenCalculator screenCalculator = new ScreenCalculator();
		
		ControllerCalculato controllerCalculato = new ControllerCalculato(screenCalculator);
	}
}
