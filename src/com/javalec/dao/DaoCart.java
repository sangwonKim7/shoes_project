package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.javalec.util.DBConnect;

// 장바구니에 상품추가 
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
		// 카트에 넣을 DETAIL NO 찾기 위함 
		// 조건을 걸었기 때문에 1개만 나온다 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jar 파일에 있는걸 로드한다 
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql); // 데이터 베이스와 연결 
			Statement stmt_mysql = conn_mysql.createStatement(); // 연결한 데이터 베이스의 열을 받아올 준비  

			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
			
			num = rs.getInt(1); // detailno 값 num에 대입 

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		
		return num; 
	}
	
	//사이즈,상품명,구매갯수
	
	
//	// 1. 상품과 상세선택의 연결관계인 상세선택번호를 추출 
//	// ---> detail 에서 재고가 아니라 size를 선택한건 화면에 보이는 유일한 정보라서?
//	//      다른 컬럼이 화면에 보여지면 그걸 선택해도 됨?
//	select detail_no
//	from detail d, product p
//	where d.no= '' and d.size ='' ;
//	
//	
//	// 2. 장바구니에 insert 
//	insert into cart
//	(detail_no)
//	values
//	(가져온 값)
	
	// 아직 작성 안됨 
//	public void addCart() {
//		int num = searchDetailNo();
//		
//		String whereStatement = "insert into cart (" + detailNo + ") values (" + num + ")";
//				
//
//		
//		
//	}
	
	
	
	
	 	
	// 1.git에 소스 올리는 법
	
	// 2.addCart() 메소드 작성 
	
	// 3. 
	
	
	
	
	
	
	
	

}
