package com.mystudy.jdbc3_vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object) : 데이터 관련 작업처리용 클래스(DB연동)-xxxDAO, xxxDao
public class StudentDAO {
	final String DRIVER = "oracle.jdbc.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "mystudy";
	final String PASSWORD = "mystudypw";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public StudentDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//id값을 받아서 DB에서 데이터 조회 후 결과값을 StudentVO에 담아서 리턴하는 메소드
	public StudentVO selectId(String id) {
		StudentVO student = null;
		//DB연동작업(SELECT)
		//2. DB 연결하고 Connection 객체 생성
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD );
			
			//3. SQL 실행을 위한 준비
			String sql = ""
					+ "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG "
					+ "	 FROM STUDENT "
					+ " WHERE ID = ? ";
			//3-1. SQL을 전달하고 실행준비 요청
			pstmt = conn.prepareStatement(sql);
			//3-2. SQL문장의 ? 위치에 값 설정
			pstmt.setString(1, id);
			
			//3-3. SQL 문장 실행 요청
			rs = pstmt.executeQuery();	
			
			//4. SQL 실행결과에 대한 처리
			if(rs.next() ) {
				student = new StudentVO();
				//student.setId(rs.getString(1));
				student.setId(rs.getString("ID")); //이렇게 ID로 표현하는게 더 좋음
				student.setName(rs.getString("NAME"));
				student.setKor(rs.getInt("KOR"));
				student.setEng(rs.getInt("ENG"));
				student.setMath(rs.getInt("MATH"));
				student.setTot(rs.getInt("TOT"));
				student.setAvg(rs.getDouble("AVG"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		
		return student;
		
	}
	//테이블 데이터 전체 가져와서 List에 담아서 리턴
	public List<StudentVO> selectAll() {
		ArrayList<StudentVO> list = null;
		//ex) arraylist 클릭하고 ctrl+t 누르면 상관관계 볼 수 있음
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD );
			
			String sql = ""
					+ "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG "
					+ "	 FROM STUDENT "
					+ " ORDER BY ID ";
			//3-1. DB에 SQL문 전달하고 실행준비
			pstmt = conn.prepareStatement(sql);
			//3-2. SQL문 실행요청
			rs = pstmt.executeQuery();
			
			list = new ArrayList<StudentVO>();
			//4. 결과값에 대한 처리
			while(rs.next()) {
				/*
				StudentVO student = new StudentVO();
				student.setId(rs.getString("ID")); 
				student.setName(rs.getString("NAME"));
				student.setKor(rs.getInt("KOR"));
				student.setEng(rs.getInt("ENG"));
				student.setMath(rs.getInt("MATH"));
				student.setTot(rs.getInt("TOT"));
				student.setAvg(rs.getDouble("AVG"));
				*/
				
				StudentVO student = new StudentVO(
						rs.getString("ID"),
						rs.getString("NAME"),
						rs.getInt("KOR"),
						rs.getInt("ENG"),
						rs.getInt("MATH"),
						rs.getInt("TOT"),
						rs.getDouble("AVG"));						
				
				list.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return list;
	}
	
	
	
	//전달받은 StudentVO 데이터를 DB에 입력
	public int insertData(StudentVO student) {
		int result = 0;
		//DB연동작업 : VO데이터 DB에 입력
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD );
			
			//3. SQL 실행을 위한 준비
			String sql = ""
					+ "INSERT INTO STUDENT"
					+ "	 	  (ID, NAME, KOR, ENG, MATH, TOT, AVG) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getKor());
			pstmt.setInt(4, student.getEng());
			pstmt.setInt(5, student.getMath());
			pstmt.setInt(6, student.getTot());
			pstmt.setDouble(7, student.getAvg());
			
			
			//SQL 문장 실행 요청
			result = pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt);
		}		
		
		return result;
		
	}
	
	private void close(Connection conn, PreparedStatement pstmt) {
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
	
	//VO를 전달받아 DB 데이터 수정(리턴 : 처리건수)
	public int updateData(StudentVO student) {
		int result = 0;
		
		//DB 연동작업 : VO데이터로 테이블  데이터 수정처리
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD );
			
			//3. Statement 객체 생성해서 SQL 실행 요청
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE STUDENT ");
			sb.append("   SET KOR = ? ");
			sb.append("     , ENG = ? ");
			sb.append("     , MATH = ? ");
			sb.append("     , TOT = ? ");
			sb.append("     , AVG = ? ");
			sb.append(" WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, student.getKor());
			pstmt.setInt(2, student.getEng());
			pstmt.setInt(3, student.getMath());
			pstmt.setInt(4, student.getTot());
			pstmt.setDouble(5, student.getAvg());
			pstmt.setString(6, student.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt);
		}
		
		return result;
	}
	
	//ID를 전달받아 DB 데이터 삭제(리턴 : 처리건수)
		public int deleteData(String id) {
			int result = 0;
			
			//DB 연동작업 : ID 값으로 데이터 삭제
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD );
				
				//3. Statement 객체 생성해서 SQL 실행 요청
				String sql = "DELETE FROM STUDENT WHERE ID = ? ";				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				
				result = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(conn, pstmt);
			}
			
			return result;
		}
	
	
	
	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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

}










