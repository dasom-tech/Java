package main;

import java.util.Scanner;

import dao.StudentDao3;

public class mainClass3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메뉴(view)
		
		StudentDao3 stDao3 = new StudentDao3();
		
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
					stDao3.insert();
					break;
				case 2:
					stDao3.delete();
					break;
				case 3:
					stDao3.select();
					break;
				case 4:
					stDao3.update();
					break;
				case 5:
					stDao3.allprint();
					break;
				case 6:
					stDao3.sorting();
					break;

			}
			
		}

	}

}