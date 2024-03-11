package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class TelaCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final boolean False = false;
	protected static final boolean Enable = false;
	private JPanel contentPane;
	private JTextField jtxtResult;

	/**
	 * Create the frame.
	 */

	double NumEnter1;
	double NumEnter2;
	double Result;
	String op;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private void EnterNumbers(String q) {
		String Nums = jtxtResult.getText() + q;
		jtxtResult.setText(Nums);

	}

	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 291, 470); 
	    setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton jbtnDigit0 = new JButton("0");
		jbtnDigit0.setBackground(new Color(248, 248, 255));
		jbtnDigit0.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("0");
			}
		});
		jbtnDigit0.setBounds(10, 374, 57, 46);
		contentPane.add(jbtnDigit0);

		JButton jbtnDot = new JButton(".");
		jbtnDot.setBackground(new Color(248, 248, 255));
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!jtxtResult.getText().contains(".")) {
					jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());

				}
			}
		});
		jbtnDot.setBounds(77, 374, 57, 46);
		contentPane.add(jbtnDot);

		JButton jbtnEquals = new JButton("=");
		jbtnEquals.setBackground(new Color(248, 248, 255));
		jbtnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NumEnter2 = Double.parseDouble(jtxtResult.getText());
				if (op == "+") {
					Result = NumEnter1 + NumEnter2;
					jtxtResult.setText(String.valueOf(Result));
				} else if (op == "-") {
					Result = NumEnter1 - NumEnter2;
					jtxtResult.setText(String.valueOf(Result));
				} else if (op == "*") {
					Result = NumEnter1 * NumEnter2;
					jtxtResult.setText(String.valueOf(Result));
				} else if (op == "/") {
					Result = NumEnter1 / NumEnter2;
					jtxtResult.setText(String.valueOf(Result));
				}

			}
		});
		jbtnEquals.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnEquals.setBounds(144, 374, 57, 46);
		contentPane.add(jbtnEquals);

		JButton jbtnDiv = new JButton("/");
		jbtnDiv.setBackground(new Color(248, 248, 255));
		jbtnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(jtxtResult.getText());
				jtxtResult.setText(" ");
				op = "/";
			}
		});
		jbtnDiv.setBounds(211, 374, 57, 46);
		contentPane.add(jbtnDiv);

		JButton jbtnDigit1 = new JButton("1");
		jbtnDigit1.setBackground(new Color(248, 248, 255));
		jbtnDigit1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("1");
			}
		});
		jbtnDigit1.setBounds(10, 317, 57, 46);
		contentPane.add(jbtnDigit1);

		JButton jbtnDigit2 = new JButton("2");
		jbtnDigit2.setBackground(new Color(248, 248, 255));
		jbtnDigit2.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("2");
			}
		});
		jbtnDigit2.setBounds(77, 317, 57, 46);
		contentPane.add(jbtnDigit2);

		JButton jbtnDigit3 = new JButton("3");
		jbtnDigit3.setBackground(new Color(248, 248, 255));
		jbtnDigit3.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("3");
			}
		});
		jbtnDigit3.setBounds(144, 317, 57, 46);
		contentPane.add(jbtnDigit3);

		JButton jbtnMult = new JButton("*");
		jbtnMult.setBackground(new Color(248, 248, 255));
		jbtnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(jtxtResult.getText());
				jtxtResult.setText(" ");
				op = "*";
			}
		});
		jbtnMult.setBounds(211, 317, 57, 46);
		contentPane.add(jbtnMult);

		JButton jbtnDigit4 = new JButton("4");
		jbtnDigit4.setBackground(new Color(248, 248, 255));
		jbtnDigit4.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("4");
			}
		});
		jbtnDigit4.setBounds(10, 260, 57, 46);
		contentPane.add(jbtnDigit4);

		JButton jbtnDigit5 = new JButton("5");
		jbtnDigit5.setBackground(new Color(248, 248, 255));
		jbtnDigit5.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("5");
			}
		});
		jbtnDigit5.setBounds(77, 260, 57, 46);
		contentPane.add(jbtnDigit5);

		JButton jbtnDigit6 = new JButton("6");
		jbtnDigit6.setBackground(new Color(248, 248, 255));
		jbtnDigit6.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("6");
			}
		});
		jbtnDigit6.setBounds(144, 260, 57, 46);
		contentPane.add(jbtnDigit6);

		JButton jbtnSub = new JButton("-");
		jbtnSub.setBackground(new Color(248, 248, 255));
		jbtnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(jtxtResult.getText());
				jtxtResult.setText(" ");
				op = "-";

			}
		});
		jbtnSub.setBounds(211, 260, 57, 46);
		contentPane.add(jbtnSub);

		JButton jbtnDigit7 = new JButton("7");
		jbtnDigit7.setBackground(new Color(248, 248, 255));
		jbtnDigit7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("7");
			}
		});
		jbtnDigit7.setBounds(10, 203, 57, 46);
		contentPane.add(jbtnDigit7);

		JButton jbtnDigit8 = new JButton("8");
		jbtnDigit8.setBackground(new Color(248, 248, 255));
		jbtnDigit8.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("8");
			}
		});
		jbtnDigit8.setBounds(77, 203, 57, 46);
		contentPane.add(jbtnDigit8);

		JButton jbtnDigit9 = new JButton("9");
		jbtnDigit9.setBackground(new Color(248, 248, 255));
		jbtnDigit9.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnDigit9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("9");
			}
		});
		jbtnDigit9.setBounds(144, 203, 57, 46);
		contentPane.add(jbtnDigit9);

		JButton jbtnPlus = new JButton("+");
		jbtnPlus.setBackground(new Color(248, 248, 255));
		jbtnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(jtxtResult.getText());
				jtxtResult.setText(" ");
				op = "+";

			}
		});
		jbtnPlus.setBounds(211, 203, 57, 46);
		contentPane.add(jbtnPlus);

		jtxtResult = new JTextField();
		jtxtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtxtResult.setBounds(10, 86, 258, 40);
		contentPane.add(jtxtResult);
		jtxtResult.setColumns(10);

		JButton jbtnBS = new JButton("<");
		jbtnBS.setBackground(new Color(248, 248, 255));
		jbtnBS.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backSp = null;

				if (jtxtResult.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(jtxtResult.getText());
					sb.deleteCharAt(jtxtResult.getText().length() - 1);
					backSp = sb.toString();
					jtxtResult.setText(backSp);
				}

			}
		});
		jbtnBS.setBounds(77, 146, 57, 46);
		contentPane.add(jbtnBS);

		JButton jbtnCE = new JButton("CE");
		jbtnCE.setBackground(new Color(248, 248, 255));
		jbtnCE.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jtxtResult.setText("");

				String Fn, Sn;

				Fn = String.valueOf(NumEnter1);
				Sn = String.valueOf(NumEnter1);

				Fn = "";
				Sn = "";

			}
		});
		jbtnCE.setBounds(144, 146, 57, 46);
		contentPane.add(jbtnCE);

		JButton jbtnC = new JButton("C");
		jbtnC.setBackground(new Color(248, 248, 255));
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtResult.setText("");
			}
		});
		jbtnC.setBounds(211, 146, 57, 46);
		contentPane.add(jbtnC);

		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(37, 26, 201, 29);
		contentPane.add(lblNewLabel);

		JRadioButton rdbtnOFF = new JRadioButton("OFF");
		rdbtnOFF.setBackground(new Color(255, 255, 255));
		rdbtnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				jbtnDigit0.setEnabled(False);
			    jbtnDigit1.setEnabled(False);
			    jbtnDigit2.setEnabled(False);
			    jbtnDigit3.setEnabled(False);
			    jbtnDigit4.setEnabled(False);
			    jbtnDigit5.setEnabled(False);
			    jbtnDigit6.setEnabled(False);
			    jbtnDigit7.setEnabled(False);
			    jbtnDigit8.setEnabled(False);
			    jbtnDigit9.setEnabled(False);
			    jbtnDot.setEnabled(False);
			    jbtnPlus.setEnabled(False);
			    jbtnSub.setEnabled(False);
			    jbtnMult.setEnabled(False);
			    jbtnDiv.setEnabled(False);
			    jbtnCE.setEnabled(False);
			    jbtnC.setEnabled(False);
			    jbtnBS.setEnabled(False);
			    jbtnEquals.setEnabled(False);
			}
		});
		buttonGroup.add(rdbtnOFF);
		rdbtnOFF.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOFF.setBounds(10, 172, 61, 23);
		contentPane.add(rdbtnOFF);

		JRadioButton rdbtnON = new JRadioButton("ON");
		rdbtnON.setBackground(new Color(255, 255, 255));
		rdbtnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				jbtnDigit0.setEnabled(true);
			    jbtnDigit1.setEnabled(true);
			    jbtnDigit2.setEnabled(true);
			    jbtnDigit3.setEnabled(true);
			    jbtnDigit4.setEnabled(true);
			    jbtnDigit5.setEnabled(true);
			    jbtnDigit6.setEnabled(true);
			    jbtnDigit7.setEnabled(true);
			    jbtnDigit8.setEnabled(true);
			    jbtnDigit9.setEnabled(true);
			    jbtnDot.setEnabled(true);
			    jbtnPlus.setEnabled(true);
			    jbtnSub.setEnabled(true);
			    jbtnMult.setEnabled(true);
			    jbtnDiv.setEnabled(true);
			    jbtnCE.setEnabled(true);
			    jbtnC.setEnabled(true);
			    jbtnBS.setEnabled(true);
			    jbtnEquals.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnON);
		rdbtnON.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnON.setBounds(10, 146, 57, 23);
		contentPane.add(rdbtnON);

	}
}
