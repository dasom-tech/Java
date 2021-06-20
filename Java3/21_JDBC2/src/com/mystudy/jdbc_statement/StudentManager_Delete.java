package com.mystudy.jdbc_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw" );
			
			stmt = conn.createStatement();
			
			String id = "2020002";
			String name = "홍길동888";
			int kor = 50;
			int eng = 80;
			int math = 70;
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STUDENT WHERE ID = '" + id + "' ");
			
			int cnt = stmt.executeUpdate(sql.toString());
			
			System.out.println(">>처리 건수 : " + cnt);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) conn.close();	//데이터 중복값 허용 안 하므로 다시 실행했을 때 오류남. 데이터 수정해서 다시 실행하면 됨.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>> main() 끝");
		

	}

}
