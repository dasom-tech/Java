package main;

import java.util.Arrays;

import student.Student;

public class mainClass {
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setNumber(1);
		stu.setName("홍길동");
		stu.setLanguage(95);
		stu.setMath(100);
		stu.setEnglish(85);
		
		String name = stu.getName();
		System.out.println("name: " + name);
		
		String student[][] = {
				{"aaa", "90", "80", "85"},
		};
		
		Student students[] = new Student[3];	 // 객체 배열 생성
		// Student students1, students2, students3; // 위와 동일
		
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		
		students[0].setName("aaa");
		students[0].setNumber(1);
		students[0].setLanguage(90);
		students[0].setMath(100);
		students[0].setEnglish(95);
		
		System.out.println(students[0]);
		
	}

}
