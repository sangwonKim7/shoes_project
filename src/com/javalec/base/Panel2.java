package com.javalec.base;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Panel2 extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfId;
	private JLabel lblNewLabel_1_1;
	private JTextField tfPw;
	private JLabel lblNewLabel_1_2;
	private JTextField tfAddress;
	private JLabel lblNewLabel_1_3;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JLabel lblNewLabel_1_3_1;
	private JButton btnOverlapCheck;
	private JButton btnMakeAccount;

	/**
	 * Create the panel.
	 */
	public Panel2() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getTfId());
		add(getLblNewLabel_1_1());
		add(getTfPw());
		add(getLblNewLabel_1_2());
		add(getTfAddress());
		add(getLblNewLabel_1_3());
		add(getTfEmail());
		add(getTfPhone());
		add(getLblNewLabel_1_3_1());
		add(getBtnOverlapCheck());
		add(getBtnMakeAccount());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("< 회원가입 화면 >");
			lblNewLabel.setBounds(166, 37, 98, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ID :");
			lblNewLabel_1.setBounds(49, 119, 57, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(113, 114, 151, 26);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("PW :");
			lblNewLabel_1_1.setBounds(49, 164, 57, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfPw() {
		if (tfPw == null) {
			tfPw = new JTextField();
			tfPw.setColumns(10);
			tfPw.setBounds(113, 159, 165, 26);
		}
		return tfPw;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("주소 :");
			lblNewLabel_1_2.setBounds(49, 212, 57, 16);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(113, 207, 274, 26);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("이메일 :");
			lblNewLabel_1_3.setBounds(49, 261, 57, 16);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(113, 256, 205, 26);
		}
		return tfEmail;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(113, 308, 165, 26);
		}
		return tfPhone;
	}
	private JLabel getLblNewLabel_1_3_1() {
		if (lblNewLabel_1_3_1 == null) {
			lblNewLabel_1_3_1 = new JLabel("전화번호 :");
			lblNewLabel_1_3_1.setBounds(49, 313, 57, 16);
		}
		return lblNewLabel_1_3_1;
	}
	private JButton getBtnOverlapCheck() {
		if (btnOverlapCheck == null) {
			btnOverlapCheck = new JButton("중복확인");
			btnOverlapCheck.setBounds(270, 114, 117, 29);
		}
		return btnOverlapCheck;
	}
	private JButton getBtnMakeAccount() {
		if (btnMakeAccount == null) {
			btnMakeAccount = new JButton("회원가입 완료");
			btnMakeAccount.setBounds(270, 376, 117, 29);
		}
		return btnMakeAccount;
	}
}
