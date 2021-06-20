package com.mystudy.jdbc2_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw" );
			
			String id = "2020333";
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM STUDENT WHERE id = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(">>삭제 건수 : " + cnt);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
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
