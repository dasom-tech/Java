package exam.sungjuk_map_Scanner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapSungjukScanner {
	private HashMap<String, Integer> map = new HashMap<>();	
	private Scanner sc = new Scanner(System.in);
	private int tot;
	private double avg;
	
	public MapSungjukScanner() {
		insertSampleData1();
	}
	
	private void insertSampleData1() {
		map.put("홍길동", 90);
		map.put("이다솜", 83);
		map.put("최성학", 95);
		computeData();
		
	}
	public void startSungjukProcess() {
		while (true) {
			int select = selectMainMenu();
			if(select == 0) {
				System.out.println(">>> 프로그램 종료합니다.");
				break;
			}
		}
	}
	
	private int selectMainMenu() {
		System.out.println();
		System.out.println("::성적 처리");
		System.out.println("1.성적 입력  2.성적 출력  3.성적 초기화  0.종료");
		System.out.print("작업 선택>>");
		
		int select = Integer.parseInt(sc.nextLine());
		switch (select) {
		case 1:
			//System.out.println("성적 입력 작업 처리");
			insertData();
			break;
		case 2:
			//System.out.println("성적 출력 작업 처리");
			if (map.isEmpty()) {
				System.out.println("출력할 데이터가 없습니다.");
			}else {
				printData();
			}
			break;
		case 3:
			//System.out.println("성적 초기화 작업 처리");
			map.clear();
			tot = 0;
			avg = 0;
			break;
		default:
			//System.out.println("작업 종료");
			break;
		}
		
		return select;
	}
	
	
	private void insertData() {
		while(true) {
		System.out.println("이름과 점수를 입력하세요(작업종료는 이름에 x 입력)");
		System.out.print("성명: ");
		String name = sc.nextLine();
		if ("x".equalsIgnoreCase(name)) {
			System.out.println("::데이터 입력을 종료합니다.");
			break;
		}
		System.out.print("점수: ");
		int jumsu = Integer.parseInt(sc.nextLine());
		
		map.put(name, jumsu);
		computeData(); //자동 계산 처리하도록
	}
}
	private void computeData() {
		tot = 0;	//초기화 한 다음 점수들을 합산
		for (int score : map.values()) {
			tot += score;
		}
		avg = tot * 100 / map.size() / 100.0;
		
	}
	
	private void printData() {
		System.out.println("성명\t점수");
		System.out.println("---------------");
		for (String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("---------------");
		System.out.println("총점 : \t" + tot);
		System.out.println("평균 : \t" + avg);
	}
	
}

				
