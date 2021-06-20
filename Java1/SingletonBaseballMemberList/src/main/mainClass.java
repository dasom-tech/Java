package main;

import java.util.Scanner;

import cls.AllprintClass;
import cls.DeleteClass;
import cls.FileClass;
import cls.InsertClass;
import cls.SelectClass;
import cls.UpdateClass;
import file.DataProc;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InsertClass ins = new InsertClass();
		DeleteClass del = new DeleteClass();
		SelectClass selec = new SelectClass();
		UpdateClass up = new UpdateClass();
		FileClass file = new FileClass();
		AllprintClass ap = new AllprintClass();
		
		file.dataLoad();
		
		while(true) {
			System.out.println("1.선수 추가");
			System.out.println("2.선수 삭제");
			System.out.println("3.선수 검색");
			System.out.println("4.선수 수정");
			System.out.println("5.선수 전체 출력");
			System.out.println("6.데이터 저장");
			System.out.println("7.종료");
			
			System.out.print(">> ");
			int work = sc.nextInt();
			
			switch(work) {
				case 1:
					ins.insert();
					break;
				case 2:
					del.delete();
					break;
				case 3:
					selec.select();
					break;
				case 4:
					up.update();
					break;
				case 5:
					ap.allprint();
					break;
				case 6:
					file.dataSave();
					break;
				case 7:
					System.exit(0);					
					break;			
			}
		}
		
	}
	
}
