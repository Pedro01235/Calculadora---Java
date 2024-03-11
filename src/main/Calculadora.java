package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField display;
	private double resultado = 0;
	private String operador = "=";

	public Calculadora() {
		setTitle("Calculadora");
		setLayout(new BorderLayout());

		display = new JTextField("0");
		display.setEnabled(false);
		display.setHorizontalAlignment(JTextField.RIGHT);
		add(display, BorderLayout.NORTH);

		montarTeclado();

		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void montarTeclado() {
		var painel = new JPanel();
		painel.setLayout(new GridLayout(4, 4, 5, 5));

		String[] botoes = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

		for (String textoBotao : botoes) {
			var botao = new JButton(textoBotao);
			botao.addActionListener(this);
			painel.add(botao);
		}

		add(painel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var comando = e.getActionCommand();

		  if ('0' <= comando.charAt(0) && comando.charAt(0) <= '9' || comando.equals(".")) {
		        if (display.getText().equals("0")) {
		            display.setText(comando);
		        } else {
		            display.setText(display.getText() + comando);
		        }
		    } else {
		        switch (operador) {
		            case "=":
		                resultado = Double.parseDouble(display.getText());
		                break;
		            case "+":
		                resultado += Double.parseDouble(display.getText());
		                break;
		            case "-":
		                resultado -= Double.parseDouble(display.getText());
		                break;
		            case "*":
		                resultado *= Double.parseDouble(display.getText());
		                break;
		            case "/":
		                resultado /= Double.parseDouble(display.getText());
		                break;
		        }
		        operador = comando;
		        display.setText("0");
		        if (operador.equals("=")) {
		            display.setText("" + resultado);
		            resultado = 0;
		        }
		 
		    }	
	   }
}