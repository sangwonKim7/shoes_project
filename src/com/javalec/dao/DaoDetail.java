package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.base.Panel3;
import com.javalec.dto.DtoDetail;
import com.javalec.util.DBConnect;

public class DaoDetail {

	int p_product_no;
	int detail_no;
	int size;
	int stock;

	int price;
	int amount;
	
	String guest_id;
	
	Panel3 productPanel = new Panel3();

	// Constructor
	public DaoDetail() {
		// TODO Auto-generated constructor stub
	}

	public DaoDetail(int detail_no, int size, int stock) {
		super();
		this.detail_no = detail_no;
		this.size = size;
		this.stock = stock;
	}

	public DaoDetail(int size, int stock) {
		super();
		this.size = size;
		this.stock = stock;
	}
	

	public DaoDetail(int size) {
		super();
		this.size = size;
	}
	
	

	
	
	public DaoDetail(String guest_id, int detail_no, int p_product_no, int price, int amount) {
		super();
		this.guest_id = guest_id;
		this.detail_no = detail_no;
		this.p_product_no = p_product_no;
		this.price = price;
		this.amount = amount;
	}

	// Method
	public ArrayList<DtoDetail> selectList(){
		
		ArrayList<DtoDetail> dtoList = new ArrayList<DtoDetail>();

		String whereStatement = "select detail_no, size, stock from detail ";
		String whereStatement2 = "where p_product_no = " + Panel3.clickNo;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql, DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
	
			ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);
	
			while (rs.next()) { // true값일때만 가져온다
				
				int wkDetailNo = rs.getInt(1);
				int wkSize = rs.getInt(2);
				int wkStock = rs.getInt(3);
			
				DtoDetail dto = new DtoDetail(wkDetailNo,wkSize, wkStock);
				dtoList.add(dto);
			}
	
			conn_mysql.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtoList;

	}
	
	// 입력
	public boolean insertAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql, DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "insert into cart (c_guest_id, cd_detail_no, cd_product_no, price, amount) "; // *** 마지막 한칸 뛰기 ***
			String query1 = "values (?,?,?,?,?)";
			
			ps = conn_mysql.prepareStatement(query + query1);
			ps.setString(1, guest_id);
			ps.setInt(2, detail_no);
			ps.setInt(3, p_product_no);
			ps.setInt(4, price);
			ps.setInt(5, amount);
			
			ps.executeUpdate(); // 끝나면 int값이 날라오는구나 / -1은 에러 / 1인지 -1인지 확인 <<< 쓰는이유????????????????????? >>>
			
			conn_mysql.close(); // 여러명이 쓴다는것을 생각해야함
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}


	
}
