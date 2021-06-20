package main;

import java.util.Scanner;

import dao.StudentDao2;

public class mainClass2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메뉴(view)
		
		StudentDao2 stDao1 = new StudentDao2();
		
		while(true) {
			
			System.out.println("1.학생 정보 추가");
			System.out.println("2.학생 정보 삭제");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 수정");
			System.out.println("5.학생 정보 모두 출력");
			System.out.println("6.영어 점수의 순위");
			System.out.println("7.종료");
			
			System.out.print("어느 작업을 하시겠습니까? = ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					stDao1.insert();
					break;
				case 2:
					stDao1.delete();
					break;
				case 3:
					stDao1.select();
					break;
				case 4:
					stDao1.update();
					break;
				case 5:
					stDao1.allprint();
					break;
				case 6:
					stDao1.sorting();
					break;

			}
			
		}

	}

}
