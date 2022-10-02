package com.javalec.base;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.dao.DaoDetail;
import com.javalec.dto.DtoDetail;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel4 extends JPanel {
	private JLabel lbImage;
	private JLabel lbBrand;
	private JScrollPane scrollPane;
	private JButton btnCart;
	private JLabel lbModel;
	private JLabel lbPrice;
	private JComboBox cbAmount;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // ******* 테이블준비하기(1/2) 바깥모양임
	Panel3 panel3 = new Panel3();
	public static int clickDetailNo;
	public static int clickSize;
	public static int clickAmount;
	private JTable Inner_Table;


	/**
	 * Create the panel.
	 */
	public Panel4() {
		setLayout(null);
		add(getLbImage());
		add(getLbBrand());
		add(getLbModel());
		add(getLbPrice());
		add(getScrollPane());
		add(getCbAmount());
		add(getLblNewLabel());
		add(getBtnCart());
		add(getLblNewLabel_1());

	}
	private JLabel getLbImage() {
		if (lbImage == null) {
			lbImage = new JLabel("");
			lbImage.setBounds(23, 48, 248, 184);
		}
		return lbImage;
	}
	private JLabel getLbBrand() {
		if (lbBrand == null) {
			lbBrand = new JLabel();
			lbBrand.setText((String) null);
			lbBrand.setBounds(283, 81, 161, 22);
		}
		return lbBrand;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(23, 244, 239, 184);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) { //					좌측마우스 클릭 -> 1
						tableClick(); // 						테이블 클릭 시에 해당 테이블 행의 정보를 int clickNo에 저장
					}
	
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); // 								테이블 세팅하기(2/2) **********
	
		}
		return Inner_Table;
	}
	private JLabel getLbModel() {
		if (lbModel == null) {
			lbModel = new JLabel();
			lbModel.setText((String) null);
			lbModel.setBounds(283, 129, 161, 22);
		}
		return lbModel;
	}
	private JLabel getLbPrice() {
		if (lbPrice == null) {
			lbPrice = new JLabel();
			lbPrice.setText("0");
			lbPrice.setBounds(283, 178, 161, 22);
		}
		return lbPrice;
	}
	private JComboBox getCbAmount() {
		if (cbAmount == null) {
			cbAmount = new JComboBox();
			cbAmount.setBounds(296, 355, 68, 27);
		}
		return cbAmount;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("개");
			lblNewLabel.setBounds(362, 359, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("< 장바구니 >");
			lblNewLabel_1.setBounds(185, 20, 83, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnCart() {
		if (btnCart == null) {
			btnCart = new JButton("장바구니에 담기");
			btnCart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clickAmount = cbAmount.getSelectedIndex() + 1;
					insertAction();
				}
			});
			btnCart.setBounds(296, 394, 117, 29);
		}
		return btnCart;
	}
	
	// -------------------------------- Function -----------------------------------

	private void tableInit() {
		Outer_Table.addColumn("detail_no"); // 1234
		Outer_Table.addColumn("사이즈"); // 1234
		Outer_Table.addColumn("재고");
	
		Outer_Table.setColumnCount(3); // 		***************
	
		int i = Outer_Table.getRowCount();
		for (int j = 0; j < i; j++) {
			Outer_Table.removeRow(0);
		}
	
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF); // 리사이즈 못하게 정의
	
		int vColIndex = 0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex); // 0번부터
		int width = 50;
		col.setPreferredWidth(width);
	
		vColIndex = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
	}

	// DB to Table
	private void searchAction() {
		DaoDetail dao = new DaoDetail();
		dao.selectList();
		ArrayList<DtoDetail> dtoList = dao.selectList();
		
		int listCount = dtoList.size();
		
		for(int index=0; index < listCount; index++) {
			String[] qTxt = {Integer.toString(dtoList.get(index).getDetail_no()), Integer.toString(dtoList.get(index).getSize()), Integer.toString(dtoList.get(index).getStock())};
			Outer_Table.addRow(qTxt);
			
		}	
	}
	
	private void tableClick() {		
		int i = Inner_Table.getSelectedRow();
		String wkSequence = (String) Inner_Table.getValueAt(i, 0); // String type으로 바꿔준다
		clickDetailNo = Integer.parseInt(wkSequence);

	}
	
	
	private void insertAction() {
		DaoDetail dao = new DaoDetail("id", clickDetailNo, panel3.clickNo, panel3.clickPrice, clickAmount);
		boolean ok = dao.insertAction();
		if (ok == true) {
			JOptionPane.showMessageDialog(null, "장바구니에 담겼습니다.");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // End
