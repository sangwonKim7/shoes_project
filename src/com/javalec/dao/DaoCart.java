package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.javalec.util.DBConnect;

// ��ٱ��Ͽ� ��ǰ�߰� 
public class DaoCart {
	
	private int no;
	private int size;
	private int detailNo;
	private int productNo;
	private int price;
	private int amount;
          
	

	public DaoCart(int no, int size) {
		this.no = no;
		this.size = size;
	}
	public DaoCart(int size, int detailNo, int productNo, int price, int amount) {
		this.size = size;
		this.detailNo = detailNo;
		this.productNo = productNo;
		this.price = price;
		this.amount = amount;
	}
	
	
	public int searchDetailNo() {
		int num = 0;
	 	
		String whereStatement = "select detail_no from detail where p_product_no= " + no + " and size = " + size ;
		// īƮ�� ���� DETAIL NO ã�� ���� 
		// ������ �ɾ��� ������ 1���� ���´� 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jar ���Ͽ� �ִ°� �ε��Ѵ� 
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql); // ������ ���̽��� ���� 
			Statement stmt_mysql = conn_mysql.createStatement(); // ������ ������ ���̽��� ���� �޾ƿ� �غ�  

			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
			
			num = rs.getInt(1); // detailno �� num�� ���� 

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		
		return num; 
	}
	
	//������,��ǰ��,���Ű���
	
	
//	// 1. ��ǰ�� �󼼼����� ��������� �󼼼��ù�ȣ�� ���� 
//	// ---> detail ���� ��� �ƴ϶� size�� �����Ѱ� ȭ�鿡 ���̴� ������ ������?
//	//      �ٸ� �÷��� ȭ�鿡 �������� �װ� �����ص� ��?
//	select detail_no
//	from detail d, product p
//	where d.no= '' and d.size ='' ;
//	
//	
//	// 2. ��ٱ��Ͽ� insert 
//	insert into cart
//	(detail_no)
//	values
//	(������ ��)
	
	// ���� �ۼ� �ȵ� 
//	public void addCart() {
//		int num = searchDetailNo();
//		
//		String whereStatement = "insert into cart (" + detailNo + ") values (" + num + ")";
//				
//
//		
//		
//	}
	
	
	
	
	 	
	// 1.git�� �ҽ� �ø��� ��
	
	// 2.addCart() �޼ҵ� �ۼ� 
	
	// 3. 
	
	
	
	
	
	
	
	

}
