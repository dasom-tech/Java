package com.mystudy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Select {

	public static void main(String[] args) {
		/*
	 	JDBC 이용한 DB 프로그래밍 방법
		0. JDBC 라이브러리 사용 개발 환경 설정(jdbc.jar 빌드패스 등록)
		1. JDBC 드라이버 로딩
		2. DB 연결하고 Connection 객체 생성
		3. Statement 문 생성 및 실행(SQL문 - 쿼리문실행)
		4. 결과물에 대한 처리
		    - SELECT : 조회 데이터 결과값 처리
		    - INSERT, UPDATE, DELETE : int 값(처리 건수) 처리
		5. 클로징 처리에 의한 자원 반납
	 */
		
		//1. JDBC 드라이버 로딩
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩 실패!!");
			e.printStackTrace();
		}
		
		//2. DB 연결하고 Connection 객체 생성
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", //@127.0.0.1 == @localhost
					"mystudy", "mystudypw" );
			//oracle에서 사용하고 있는 포트:1521
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패(connection fail");
			e.printStackTrace();
		}
		
		//3. Statement 문 생성 및 실행(SQL문 - 쿼리문실행)
		Statement stmt = null;
		ResultSet rs = null;	//resultset타입은 테이블 형태라고 보면 됨. 커서는 아직 데이터를 가르키지않고 있는 상태.
		try {
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
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 5. 클로징 처리에 의한 자원 반납
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
		
		System.out.println(">>>> main() 끝");

	}

}


















