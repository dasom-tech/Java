package main;

import java.util.Scanner;
import dao.MemberDao;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDao dao = new MemberDao();

		// 메뉴
		while(true) {
			System.out.println("실행할 작업을 선택하세요.");
			System.out.print("1.선수 추가  ");
			System.out.print("2.선수 삭제  ");
			System.out.print("3.선수 검색  ");
			System.out.print("4.선수 수정  ");
			System.out.print("5.선수 전체 출력  ");
			System.out.println("6.데이터 파일에 저장후 출력 ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:
					dao.update();
					break;
				case 5:
					dao.allprint();
					break;
				case 6:
					dao.save();
					dao.load();
					dao.allprint();
			
				}
		}
	}
}




