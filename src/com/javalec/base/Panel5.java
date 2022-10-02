package com.javalec.base;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Panel5 extends JPanel {
	private JTable Inner_Table;
	private JTextField textField;
	private final DefaultTableModel Outer_Table = new DefaultTableModel();

	/**
	 * Create the panel.
	 */
	public Panel5() {
		setLayout(null);
		
		JLabel lblCartList = new JLabel("장바구니 목록");
		lblCartList.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblCartList.setBounds(25, 19, 148, 37);
		add(lblCartList);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 68, 415, 131);
		add(scrollPane);

		Inner_Table = new JTable();
		scrollPane.setViewportView(Inner_Table);
		Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Inner_Table.setModel(Outer_Table); 

		JButton btnNewButton = new JButton("취소");
		btnNewButton.setBounds(316, 211, 117, 29);
		add(btnNewButton);

		JLabel lblTotalPrice = new JLabel("총 가격 : ");
		lblTotalPrice.setBounds(25, 263, 61, 16);
		add(lblTotalPrice);

		textField = new JTextField();
		textField.setBounds(98, 258, 176, 26);
		add(textField);
		textField.setColumns(10);

		JLabel lblWon = new JLabel("원");
		lblWon.setBounds(287, 263, 61, 16);
		add(lblWon);

		JButton btnBuy = new JButton("구매하기");
		btnBuy.setBounds(316, 399, 117, 29);
		add(btnBuy);

	}

	private void CarttableInit() {
		Outer_Table.addColumn("모델명");
		Outer_Table.addColumn("사이즈");
		Outer_Table.addColumn("수량");
		Outer_Table.addColumn("브랜드");
		Outer_Table.addColumn("가격");

		Outer_Table.setColumnCount(5);

		// table에 있는 데이터 지우기
		int a = Outer_Table.getRowCount();
		for (int i = 0; i < a; i++) {
			Outer_Table.removeRow(0); // 열이 하나씩 당겨지기 때문에
		}

		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		// 순서 column
		int vColIndex = 0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 50;
		col.setPreferredWidth(width);

		vColIndex = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;

		vColIndex = 2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 150;
		col.setPreferredWidth(width);
		vColIndex = 3;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);

		vColIndex = 4;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
	}
}
