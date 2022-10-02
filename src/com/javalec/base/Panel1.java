package com.javalec.base;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel1 extends JPanel {
	private JTextField tfID;
	private JTextField tfPassword;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	
	/**
	 * Create the panel.
	 */
	public Panel1() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log in");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		lblNewLabel.setBounds(165, 67, 120, 60);
		add(lblNewLabel);
		
		tfID = new JTextField();
		tfID.setBounds(195, 163, 120, 21);
		add(tfID);
		tfID.setColumns(10);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(195, 204, 120, 21);
		add(tfPassword);
		
		lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(102, 166, 81, 15);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(102, 207, 81, 15);
		add(lblNewLabel_2);
		
		JButton btnLogIn = new JButton("log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.panel1.setVisible(false);
				Main.frame.add(new Panel3());


				
			}
		});
		btnLogIn.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLogIn.setBounds(102, 276, 95, 23);
		add(btnLogIn);
		
		JButton btnSignUp = new JButton("sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.panel1.setVisible(false);
				Main.frame.add(new Panel2());
			}
		});
		btnSignUp.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSignUp.setBounds(220, 276, 95, 23);
		add(btnSignUp);

	}
}
