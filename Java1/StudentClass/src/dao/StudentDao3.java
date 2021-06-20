package dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import student.Student;

public class StudentDao3 {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Student> list = null;
	
	public StudentDao3() {
		list = new ArrayList<Student>();
		
		list.add(new Student(1,"홍길동",100,90,95));
		list.add(new Student(2,"일지매",90,85,55));
		list.add(new Student(3,"박서준",70,65,85));
	}
	
	public void insert() {
		System.out.println("number = ");
		int number = sc.nextInt();
		
		System.out.println("name = ");
		String name = sc.next();
		
		System.out.println("국어 = ");
		int language = sc.nextInt();
		
		System.out.println("수학 = ");
		int math = sc.nextInt();
		
		System.out.println("영어 = ");
		int english = sc.nextInt();
		
		Student student = new Student(number, name, language, math, english);
		list.add(student);
		
	}
	public void delete() {
		System.out.println("삭제할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals(s.getName())) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			list.remove(index);
		}else {
			System.out.println("학생 데이터를 찾을 수 없습니다.");
		}
	}
	
	public void select() {
		System.out.println("검색할 학생명 = ");
		String name = sc.next();
		
		List<Student> flist = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals(s.getName())) {
				flist.add(s);
			}
		}
		if(!flist.isEmpty()) {
			System.out.println("검색된 데이터는 = ");
			for (int i = 0; i < flist.size(); i++) {
				System.out.println(flist.get(i).toString());
			}
		}else {
			System.out.println("학생 데이터를 찾을 수 없습니다.");
		}
	}
	
	public void update() {
		System.out.println("수정할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals(s.getName())) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생 데이터를 찾을 수 없습니다.");
			return;
		}
		System.out.println("수정할 데이터를 입력해주세요.");
		System.out.println("이름 = ");
		String name1 = sc.next();
		
		System.out.println("국어 = ");
		int lang1 = sc.nextInt();
		
		System.out.println("수학 = ");
		int math1 = sc.nextInt();
		
		System.out.println("영어 = ");
		int eng1 = sc.nextInt();
		
		Student s = list.get(index);
		s.setName(name1);
		s.setLanguage(lang1);
		s.setMath(math1);
		s.setEnglish(eng1);
		
		System.out.println("수정되었습니다.");
	}
	
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.toString());
		}
	}
	
	public void sorting() {
		LinkedList<Student> sortlist = new LinkedList<Student>();
		
		for (Student s : list) {
			sortlist.add(s);
		}
		
		
		Student stu = null;
		for (int i = 0; i < sortlist.size() - 1; i++) {
			for (int j = i + 1; j < sortlist.size(); j++) {
				int num1 = sortlist.get(i).getEnglish();
				int num2 = sortlist.get(j).getEnglish();
				
				if(num1 > num2) {
					stu = sortlist.get(i);
					sortlist.set(i, sortlist.get(j));
					sortlist.set(j, stu);
				}
			}
		}
		System.out.println("정렬된 영어점수: 내림차순>>> ");
		for (int i = 0; i < sortlist.size(); i++) {
			Student s = sortlist.get(i);
			System.out.println(s.toString());
		}
	}
		

}
