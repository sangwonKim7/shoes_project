package com.javalec.base;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Panel2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public Panel2() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785 \uD654\uBA74");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setBounds(159, 40, 130, 45);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1.setBounds(48, 117, 50, 15);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText(" ");
		textField.setBounds(106, 113, 222, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel pw = new JLabel("PW");
		pw.setFont(new Font("±¼¸²", Font.BOLD, 15));
		pw.setBounds(48, 147, 50, 26);
		add(pw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 149, 222, 21);
		add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(47, 191, 50, 15);
		add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 187, 222, 21);
		add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_1_3.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(45, 229, 50, 15);
		add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 225, 222, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 265, 222, 21);
		add(textField_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1_5.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(44, 310, 68, 17);
		add(lblNewLabel_1_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(115, 306, 222, 21);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(114, 348, 222, 21);
		add(textField_6);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.setBounds(347, 113, 91, 26);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785 \uC644\uB8CC");
		btnNewButton_1.setBounds(218, 395, 116, 26);
		add(btnNewButton_1);

	}
}
