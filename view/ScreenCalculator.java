package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ScreenCalculator extends JFrame{

	private JButton buttonSoma, 
					buttonSubtrair, 
					buttonDividir, 
					buttonMultiplicar, 
					buttonIgual, 
					buttonVirgula,
					buttonNumberZero,
					buttonNumberOne,
					buttonNumberTwo,
					buttonNumberThree,
					buttonNumberFour,
					buttonNumberFive,
					buttonNumberSix,
					buttonNumberSeven,
					buttonNumberEight,
					buttonNumberNine,
					buttonC;
	
	private JTextField visor;
	
	public ScreenCalculator() {
		super("Calculadora");
		setSize(260, 255);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		buttonSoma = new JButton("+");
		buttonSoma.setBounds(145, 182, 41, 30);
		add(buttonSoma);
		
		buttonSubtrair = new JButton("-");
		buttonSubtrair.setBounds(145, 149, 41, 30);
		add(buttonSubtrair);
		
		buttonMultiplicar = new JButton("x");
		buttonMultiplicar.setBounds(145, 116, 41, 30);
		add(buttonMultiplicar);
		
		buttonDividir = new JButton("/");
		buttonDividir.setBounds(145, 83, 41, 30);
		add(buttonDividir);
		
		buttonIgual = new JButton("=");
		buttonIgual.setBounds(191, 149, 50, 63);
		add(buttonIgual);
		
		buttonVirgula = new JButton(",");
		buttonVirgula.setBounds(100, 182, 41, 30);
		add(buttonVirgula);
		
		buttonNumberZero = new JButton("0");
		buttonNumberZero.setBounds(7, 182, 86, 30);
		add(buttonNumberZero);
		
		buttonNumberOne = new JButton("1");
		buttonNumberOne.setBounds(7, 149, 41, 30);
		add(buttonNumberOne);
		
		buttonNumberTwo = new JButton("2");
		buttonNumberTwo.setBounds(52, 149, 41, 30);
		add(buttonNumberTwo);
		
		buttonNumberThree = new JButton("3");
		buttonNumberThree.setBounds(100, 149, 41, 30);
		add(buttonNumberThree);
		
		buttonNumberFour = new JButton("4");
		buttonNumberFour.setBounds(7, 116, 41, 30);
		add(buttonNumberFour);
		
		buttonNumberFive = new JButton("5");
		buttonNumberFive.setBounds(52, 116, 41, 30);
		add(buttonNumberFive);
		
		buttonNumberSix = new JButton("6");
		buttonNumberSix.setBounds(100, 116, 41, 30);
		add(buttonNumberSix);
		
		buttonNumberSeven = new JButton("7");
		buttonNumberSeven.setBounds(7, 83, 41, 30);
		add(buttonNumberSeven);
		
		buttonNumberEight = new JButton("8");
		buttonNumberEight.setBounds(52, 83, 41, 30);
		add(buttonNumberEight);
		
		buttonNumberNine = new JButton("9");
		buttonNumberNine.setBounds(100, 83, 41, 30);
		add(buttonNumberNine);
		
		buttonC = new JButton("c");
		buttonC.setBounds(52, 45, 41, 32);
		add(buttonC);
		
		visor = new JTextField("0");
		visor.setBounds(5, 10, 230, 30);
		add(visor);
		
		setVisible(true);
	}

	public JButton getButtonSoma() {
		return buttonSoma;
	}

	public void setButtonSoma(JButton buttonSoma) {
		this.buttonSoma = buttonSoma;
	}

	public JButton getButtonSubtrair() {
		return buttonSubtrair;
	}

	public void setButtonSubtrair(JButton buttonSubtrair) {
		this.buttonSubtrair = buttonSubtrair;
	}

	public JButton getButtonDividir() {
		return buttonDividir;
	}

	public void setButtonDividir(JButton buttonDividir) {
		this.buttonDividir = buttonDividir;
	}

	public JButton getButtonMultiplicar() {
		return buttonMultiplicar;
	}

	public void setButtonMultiplicar(JButton buttonMultiplicar) {
		this.buttonMultiplicar = buttonMultiplicar;
	}

	public JButton getButtonIgual() {
		return buttonIgual;
	}

	public void setButtonIgual(JButton buttonIgual) {
		this.buttonIgual = buttonIgual;
	}


	public JButton getButtonVirgula() {
		return buttonVirgula;
	}

	public void setButtonVirgula(JButton buttonVirgula) {
		this.buttonVirgula = buttonVirgula;
	}

	public JButton getButtonNumberZero() {
		return buttonNumberZero;
	}

	public void setButtonNumberZero(JButton buttonNumberZero) {
		this.buttonNumberZero = buttonNumberZero;
	}

	public JButton getButtonNumberOne() {
		return buttonNumberOne;
	}

	public void setButtonNumberOne(JButton buttonNumberOne) {
		this.buttonNumberOne = buttonNumberOne;
	}

	public JButton getButtonNumberTwo() {
		return buttonNumberTwo;
	}

	public void setButtonNumberTwo(JButton buttonNumberTwo) {
		this.buttonNumberTwo = buttonNumberTwo;
	}

	public JButton getButtonNumberThree() {
		return buttonNumberThree;
	}

	public void setButtonNumberThree(JButton buttonNumberThree) {
		this.buttonNumberThree = buttonNumberThree;
	}

	public JButton getButtonNumberFour() {
		return buttonNumberFour;
	}

	public void setButtonNumberFour(JButton buttonNumberFour) {
		this.buttonNumberFour = buttonNumberFour;
	}

	public JButton getButtonNumberFive() {
		return buttonNumberFive;
	}

	public void setButtonNumberFive(JButton buttonNumberFive) {
		this.buttonNumberFive = buttonNumberFive;
	}

	public JButton getButtonNumberSix() {
		return buttonNumberSix;
	}

	public void setButtonNumberSix(JButton buttonNumberSix) {
		this.buttonNumberSix = buttonNumberSix;
	}

	public JButton getButtonNumberSeven() {
		return buttonNumberSeven;
	}

	public void setButtonNumberSeven(JButton buttonNumberSeven) {
		this.buttonNumberSeven = buttonNumberSeven;
	}

	public JButton getButtonNumberEight() {
		return buttonNumberEight;
	}

	public void setButtonNumberEight(JButton buttonNumberEight) {
		this.buttonNumberEight = buttonNumberEight;
	}

	public JButton getButtonNumberNine() {
		return buttonNumberNine;
	}

	public void setButtonNumberNine(JButton buttonNumberNine) {
		this.buttonNumberNine = buttonNumberNine;
	}

	public JButton getButtonC() {
		return buttonC;
	}

	public void setButtonC(JButton buttonC) {
		this.buttonC = buttonC;
	}

	public JTextField getVisor() {
		return visor;
	}

	public void setVisor(JTextField visor) {
		this.visor = visor;
	}
}
