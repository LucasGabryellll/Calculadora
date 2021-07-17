package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Operation;
import view.ScreenCalculator;

public class ControllerCalculato implements ActionListener{

	ScreenCalculator screenCalculator;
	Operation operation;
	double valueOne = 0;
	String signal;
	
	int values[] = new int[2];
	
	public ControllerCalculato(ScreenCalculator screenCalculator) {
		super();
		this.screenCalculator = screenCalculator;
		
		actionsButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		
		if(object == screenCalculator.getButtonNumberZero()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("0");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "0");				
			}
		}
		
		if (object == screenCalculator.getButtonNumberOne()) {
			
			if(screenCalculator.getVisor().getText().equals("0") ) {
				screenCalculator.getVisor().setText("1");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "1");		
			}
			
		}
		
		if (object == screenCalculator.getButtonNumberTwo()) {
			
			if(screenCalculator.getVisor().getText().equals("0") ) {
				screenCalculator.getVisor().setText("2");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "2");		
			}
			
		}
		
		if (object == screenCalculator.getButtonNumberThree()) {

			if (screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("3");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "3");
			}

		}
		
		if(object == screenCalculator.getButtonNumberFour()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("4");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "4");				
			}
		}
		
		if(object == screenCalculator.getButtonNumberFive()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("5");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "5");				
			}
		}
		
		if(object == screenCalculator.getButtonNumberSix()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("6");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "6");				
			}
		}
		
		if(object == screenCalculator.getButtonNumberSeven()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("7");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "7");				
			}
		}
		
		if(object == screenCalculator.getButtonNumberEight()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("8");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "8");				
			}
		}
		
		if(object == screenCalculator.getButtonNumberNine()) {
			if(screenCalculator.getVisor().getText().equals("0")) {
				screenCalculator.getVisor().setText("9");
			} else {
				screenCalculator.getVisor().setText(screenCalculator.getVisor().getText() + "9");				
			}
		}
		
		if(object == screenCalculator.getButtonSoma()) {
			
			values[0] = Integer.parseInt(screenCalculator.getVisor().getText());
			screenCalculator.getVisor().setText("0");
			signal = "+";
			
		}
		
		if (object == screenCalculator.getButtonSubtrair()) {

			values[0] = Integer.parseInt(screenCalculator.getVisor().getText());
			screenCalculator.getVisor().setText("0");
			signal = "-";

		}
		
		if (object == screenCalculator.getButtonMultiplicar()) {

			values[0] = Integer.parseInt(screenCalculator.getVisor().getText());
			screenCalculator.getVisor().setText("0");
			signal = "*";

		}
		
		if (object == screenCalculator.getButtonDividir()) {

			values[0] = Integer.parseInt(screenCalculator.getVisor().getText());
			screenCalculator.getVisor().setText("0");
			signal = "/";

		}
		
		if(object == screenCalculator.getButtonIgual()) {
			values[1] = Integer.parseInt(screenCalculator.getVisor().getText());
			Operation.operation(values, signal);
			
			screenCalculator.getVisor().setText("" + Operation.operation(values, signal));
		}
		
		if(object == screenCalculator.getButtonC()) {
			
			screenCalculator.getVisor().setText("0");
		
		}
	
	}
	
	public void actionsButtons() {
		screenCalculator.getButtonNumberZero().addActionListener(this);
		screenCalculator.getButtonNumberOne().addActionListener(this);
		screenCalculator.getButtonNumberTwo().addActionListener(this);
		screenCalculator.getButtonNumberThree().addActionListener(this);
		screenCalculator.getButtonNumberFour().addActionListener(this);
		screenCalculator.getButtonNumberFive().addActionListener(this);
		screenCalculator.getButtonNumberSix().addActionListener(this);
		screenCalculator.getButtonNumberSeven().addActionListener(this);
		screenCalculator.getButtonNumberEight().addActionListener(this);
		screenCalculator.getButtonNumberNine().addActionListener(this);
		screenCalculator.getButtonSoma().addActionListener(this);
		screenCalculator.getButtonSubtrair().addActionListener(this);
		screenCalculator.getButtonMultiplicar().addActionListener(this);
		screenCalculator.getButtonDividir().addActionListener(this);
		screenCalculator.getButtonIgual().addActionListener(this);
		screenCalculator.getButtonC().addActionListener(this);
	}
}
