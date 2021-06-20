package com.mystudy.jdbc2_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Update {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB 연결하고 Connection 객체 생성
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw" );
			
			//3. Statement문 생성 및 실행(SQL문 - 쿼리문 실행)
			String id = "2020333";
			String name = "홍길동123";
			int kor = 50;
			int eng = 40;
			int math = 30;
			
			String sql = ""
					+ "UPDATE STUDENT "
					+ "Set name = ?, kor = ?, eng = ?, math = ? "
					+ "Where id = ?";
			System.out.println("sql : " + sql);
			
			pstmt = conn.prepareStatement(sql);
			
			int i = 1;
			pstmt.setString(i++, name);	//1번
			pstmt.setInt(i++, kor);
			pstmt.setInt(i++, eng);
			pstmt.setInt(i++, math);
			pstmt.setString(i++, id);
			
			int cnt = pstmt.executeUpdate();
			
			//4.결과물에 대한 처리
			System.out.println(">> 입력 건수 : " + cnt);			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
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
