package com.mystudy.jdbc3_vo;

import java.util.Iterator;
import java.util.List;

public class StudentDAO_Test {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		System.out.println("=====전체 데이터 검색======");
		List<StudentVO> list = dao.selectAll();		//arraylist로 받아도됨. 부모타입인 list로 받아도되고.
		for (StudentVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("------------------------");		
		
		
		StudentVO svo = dao.selectId("2020111");
		System.out.println(svo);
		
		//데이터 입력처리(INSERT)
		System.out.println("========데이터 입력=========");
		StudentVO student = new StudentVO("2020111", "홍길동8", 100, 90, 81);
		System.out.println("student : " + student);
		int result = dao.insertData(student);
		System.out.println("처리건수 : " + result);
		
		//데이터 수정처리(UPDATE)
		System.out.println("========데이터 수정=========");
		StudentVO studentUpd = dao.selectId("2020111");
		System.out.println(">> 변경전 : " + studentUpd);
		studentUpd.setKor(95);
		result = dao.updateData(studentUpd);
		System.out.println("result : " + result);
		
		studentUpd = dao.selectId("2020111");
		System.out.println(">> 변경후: " + studentUpd);
		
		//데이터 삭제(DELETE)
		System.out.println("========데이터 삭제=========");
		result = dao.deleteData("2020111");
		System.out.println("result : " + result);
		System.out.println("삭제후 : " + dao.selectId("2020111"));
	}

}
