package JavaFirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Addition_Subtraction {

	private JFrame frmJavaCalculator;
	private JTextField textField;
	private JTextField TextField;
	
	int firstnum, secondnum, result;
	String operations, answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addition_Subtraction window = new Addition_Subtraction();
					window.frmJavaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addition_Subtraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCalculator = new JFrame();
		frmJavaCalculator.setTitle("Java Calculator");
		frmJavaCalculator.setBounds(100, 100, 559, 694);
		frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 635, 543, 20);
		frmJavaCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//1
		JButton number1 = new JButton("1");
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = TextField.getText() + number1.getText();
				TextField.setText(EnterNumber);
				
				
			}
		});
		number1.setBounds(25, 230, 68, 86);
		frmJavaCalculator.getContentPane().add(number1);
		
		//2
		
		JButton number2 = new JButton("2");
		number2.setBounds(132, 230, 68, 86);
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				String EnterNumber = TextField.getText() + number2.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number2);
		
		
		
		// 3
		JButton number3 = new JButton("3");
		number3.setBounds(237, 230, 68, 86);
		number3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number3.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number3);
		
		// 4
		JButton number4 = new JButton("4");
		number4.setBounds(25, 335, 68, 86);
		number4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number4.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number4);
		
		
		// 5
		JButton number5 = new JButton("5");
		number5.setBounds(132, 335, 68, 86);
		number5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number5.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number5);
		
		
		// 6
		JButton number6 = new JButton("6");
		number6.setBounds(237, 335, 68, 86);
		number6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number6.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number6);
		
		// 7
		JButton number7 = new JButton("7");
		number7.setBounds(25, 444, 68, 86);
		number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number7.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number7);
		
		// 8
		JButton number8 = new JButton("8");
		number8.setBounds(132, 444, 68, 86);
		number8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number8.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number8);
		
		
		// 9
		JButton number9 = new JButton("9");
		number9.setBounds(237, 444, 68, 86);
		number9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String EnterNumber = TextField.getText() + number9.getText();
				TextField.setText(EnterNumber);
			}
		});
		frmJavaCalculator.getContentPane().add(number9);
		
		// 0
		JButton number0 = new JButton("0");
		number0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = TextField.getText() + number0.getText();
				TextField.setText(EnterNumber);
			}
			
		});
		number0.setBounds(25, 541, 68, 86);
		frmJavaCalculator.getContentPane().add(number0);
		
		// +
		JButton addButton = new JButton("+");
		addButton.setBounds(381, 230, 107, 86);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				firstnum = Integer.parseInt(TextField.getText());
				TextField.setText("");
				operations = "+";
				
				
			}
		});
		frmJavaCalculator.getContentPane().add(addButton);
		
		// -
		JButton subButton = new JButton("-");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Integer.parseInt(TextField.getText());
				TextField.setText("");
				operations = "-";
			}
		});
		subButton.setBounds(381, 335, 107, 86);
		frmJavaCalculator.getContentPane().add(subButton);
		
		// =
		JButton equalButton = new JButton("=");
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Integer.parseInt(TextField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = Integer.toString(result);
					TextField.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = Integer.toString(result);
					TextField.setText(answer);
				}	
				
			}
		});
		equalButton.setBounds(381, 444, 107, 86);
		frmJavaCalculator.getContentPane().add(equalButton);
		
		JButton clearButton = new JButton("C");
		clearButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		clearButton.setBounds(179, 562, 107, 62);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(null);
				
				
			}
		});
		frmJavaCalculator.getContentPane().add(clearButton);
		
		TextField = new JTextField();
		TextField.setHorizontalAlignment(SwingConstants.RIGHT);
		TextField.setBounds(25, 96, 463, 86);
		frmJavaCalculator.getContentPane().add(TextField);
		TextField.setColumns(10);
		
		
		
		
		
		/*
		 *  Make textfield have an array of stored values
		 *  on buttonclick inserts numbers view stacking from first one pressed to last. (137 = press 1 then press 3 then press 7)
		 *  
		 */
	}
}
