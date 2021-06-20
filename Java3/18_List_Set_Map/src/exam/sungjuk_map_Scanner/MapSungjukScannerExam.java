package exam.sungjuk_map_Scanner;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapSungjukScannerExam {

	public static void main(String[] args) {
		/*
		 1. HashMap<String, Integer> 타입의 변수 map 선언
		 2. map에 이름:점수 형태의 데이터를 입력(Scanner로 화면 입력)
		 	예) 홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92
		 3. 입력된 데이터를 조회해서 점수의 총점을 tot에 저장
		 4. 점수 평균을 avg에 저장(총점을 인원수로 나눈 값)
		 5. 결과 출력
		  성명	점수
		 ------------
		  홍길동	100
		  강감찬	90
		 ....
		 ============
		  총점 :	???
		  평균 :	???
		 **********************/
		
		/* 클래스 따로 안 만들고 main에 구현
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: 점수: ");
		map.put(sc.next(), sc.nextInt());
		map.put(sc.next(), sc.nextInt());
		map.put(sc.next(), sc.nextInt());
		
		System.out.println("성명\t점수");
		Set<java.util.Map.Entry<String, Integer>> entrySet = map.entrySet();
			
		Iterator<java.util.Map.Entry<String, Integer>> entryIte = entrySet.iterator();
		while (entryIte.hasNext()) {
			java.util.Map.Entry<String, Integer> entry = entryIte.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		int sum = 0;
		Collection<Integer> values = map.values();
		Iterator<Integer> iteValues = values.iterator();
		
		while (iteValues.hasNext()) {
			Integer value = iteValues.next();
			sum += value;
		}
		System.out.println("====================");
		System.out.println("점수합계 : " + sum);
		System.out.println("평균점수 : " + sum * 100 / map.size() / 100.0);
		*/
		
		MapSungjukScanner sungjuk = new MapSungjukScanner();
		sungjuk.startSungjukProcess();

	}

}


