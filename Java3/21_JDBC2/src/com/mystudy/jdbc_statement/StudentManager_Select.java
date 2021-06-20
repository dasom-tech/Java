package com.mystudy.jdbc_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Select {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB 연결하고 Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw" );
			
			//3. Statement 문 생성 및 실행(SQL문 - 쿼리문실행)
			stmt = conn.createStatement();
			
			String sql = ""									//컬럼이 많을 경우
					+ "SELECT ID, NAME, KOR, ENG, MATH "	//맨 뒤에 한 칸 띄어주어야 문자열이 안 붙어서 FROM절 인식 할 수 있음.
					+ "FROM STUDENT "
					+ "ORDER BY ID";
			rs = stmt.executeQuery(sql);
			
			//4. 결과에 대한 처리
			while (rs.next()) {	//next()해주면 커서가 아래칸인 데이터 부분을 가르키게 됨. 데이터가 있으면 true, 없으면 false를 리턴.
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getInt("KOR") + "\t";
				str += rs.getInt("ENG") + "\t";
				str += rs.getInt("MATH") + "\t";	//Ctrl + Alt + ↑ : 윗줄 복사
				System.out.println(str);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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

	}

}
