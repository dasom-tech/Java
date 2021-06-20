//ArrayList로 바꿔봄
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import student.Student;

// Data Access Object
public class StudentDao2 {
	Scanner sc = new Scanner(System.in);
	
//	private Student studentArr[] = null;
	private List<Student> list = null;
	
	// private int memberNum;
	
	public StudentDao2() {
	//	studentArr = new Student[count];
		list = new ArrayList<Student>();
	//	memberNum = 0;
		/*
		studentArr[0] = new Student(1, "홍길동", 100, 90, 80);
		studentArr[1] = new Student(2, "일지매", 90, 85, 90);
		studentArr[2] = new Student(3, "성춘향", 100, 100, 95);
		*/
		
		list.add(new Student(1, "홍길동", 100, 90, 80));
		list.add(new Student(2, "일지매", 90, 85, 90));
		list.add(new Student(3, "성춘향", 100, 100, 95));
	}
	
	// CRUD
	// 추가, 삭제, 검색, 수정
	public void insert() {	// create
		System.out.print("number = ");
		int number = sc.nextInt();
		
		System.out.print("name = ");
		String name = sc.next();
		
		System.out.print("국어 = ");
		int language = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		System.out.print("영어 = ");
		int english = sc.nextInt();
		
		// studentArr[memberNum] = new Student(number, name, language, math, english);
		Student student = new Student(number, name, language, math, english);
		list.add(student);
		
	//	memberNum++;
	}
	public void delete() {
		System.out.print("삭제할 학생명 = ");
		String name = sc.next();
		
		/*
		int index = -1;
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {
				if(name.equals(studentArr[i].getName())) {
					index = i;
					break;
				}
			}
		}		
		if(index != -1) {
			studentArr[index].setNumber(0);
			studentArr[index].setName("");
			studentArr[index].setLanguage(0);
			studentArr[index].setMath(0);
			studentArr[index].setEnglish(0);
			System.out.println("학생데이터를 삭제하였습니다");
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}
		*/
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals( s.getName() )) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			list.remove(index);
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}		
	}
	public void select() {	// search
		System.out.print("검색할 학생명 = ");
		String name = sc.next();
				
		List<Student> flist = new ArrayList<Student>(); 
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals( s.getName() )) {
				flist.add(s);
			}
		}
		
		if(!flist.isEmpty()) {
			System.out.println("검색된 데이터는 >> ");
			for (int i = 0; i < flist.size(); i++) {
				System.out.println(flist.get(i).toString());
			}
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다");
		}		
	}
	public void update() {
		System.out.print("수정할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(name.equals( s.getName() )) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("학생데이터를 찾을 수 없습니다");
			return;
		}		
		
		System.out.println("수정할 데이터를 입력해 주십시오 >> ");
		System.out.print("국어 = ");
		int lang = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		Student s = list.get(index);
		s.setLanguage(lang);
		s.setMath(math);
		s.setEnglish(eng);
		
		System.out.println("수정되었습니다");
	}
		
	public void allprint() {
		/*
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null && !studentArr[i].getName().equals("")) {
				System.out.println(studentArr[i].toString());				
			}
		}
		*/
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.toString());
		}		
	}
	
	public void sorting() {
		/*
		// 배열 복사
		int Array[] = {1, 2, 3};
	//	int Alias[] = Array;		// 얕은 복사
		int Alias[] = new int[Array.length];
		
		for (int i = 0; i < Array.length; i++) {
			Alias[i] = Array[i];	// 깊은 복사
		}		
		Alias[1] = 22;
		*/
		
		
	//	int Array[] = {1, 2, 3};
	//	int Clone[] = Array.clone();	// 얕은 복사
		
		/*
		Student arrStudent[] = new Student[studentArr.length];
		
		for (int i = 0; i < arrStudent.length; i++) {
			arrStudent[i] = new Student();
		}
		
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null) {							
				arrStudent[i].setNumber(studentArr[i].getNumber());
				arrStudent[i].setName(studentArr[i].getName());
				arrStudent[i].setLanguage(studentArr[i].getLanguage());
				arrStudent[i].setMath(studentArr[i].getMath());
				arrStudent[i].setEnglish(studentArr[i].getEnglish());
			}			
		}
				
		sortProc(arrStudent);
			
		System.out.println("영어점수의 순위 >>");
		for (Student s : arrStudent) {
			if(s != null) {
				System.out.println(s.toString());
			}
		}
		*/
		
	//	arrStudent[0].setName("정수동");
	//	System.out.println("studentArr:" + studentArr[0].getName());
	//	System.out.println("arrStudent:" + arrStudent[0].getName());
				
	//	List<Student> sortlist = new ArrayList<Student>( list );
		LinkedList<Student> sortlist = new LinkedList<Student>();
		
		for (Student s : list) {
			sortlist.add(s);
		}
		
		Student stu = null;
		for (int i = 0; i < sortlist.size() - 1; i++) {
			for (int j = i + 1; j < sortlist.size(); j++) {
				int num1 = sortlist.get(i).getEnglish();
				int num2 = sortlist.get(j).getEnglish();
				if(num1 < num2) {
					stu = sortlist.get(i);
					sortlist.set(i, sortlist.get(j));
					sortlist.set(j, stu);
				}
			}
		}
		
		System.out.println("정렬된 영어점수: 내림차순 >> ");
		for (int i = 0; i < sortlist.size(); i++) {
			Student s = sortlist.get(i);
			System.out.println(s.toString());
		}		
		
	}
	/*
	public void sortProc(Student arr[]) {		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {				
				if(arr[i].getEnglish() < arr[j].getEnglish()) {
					swap(arr, i, j);					
				}				
			}
		}
		
	}
	
	public void swap(Student arr[], int i, int j) {
		Student temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	*/

}






