package main;

import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import view.TelaCalculadora;

public class Main extends Calculadora implements ActionListener {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	TelaCalculadora calc = new TelaCalculadora();
                calc.setVisible(true);
            }
        });
    }
}
