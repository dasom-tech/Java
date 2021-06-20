package com.mystudy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam_Lotto {

	public static void main(String[] args) {
		/* (실습) Set을 이용한 로또 만들기
		 1.로또번호 : 1 ~ 45 랜덤한 숫자 6개를 Set에 저장
		 2.로또번호 6개를 추첨 후 작은 숫자부터 순서대로 화면 출력	 
		 -Math.random() 사용해서 랜덤한 숫자 만들기
		  (Math.random() * 45) +1
		  최종출력 결과 : 작은 숫자부터 큰 숫자 형태로
		  ex)금주의 로또번호 : 5, 8, 10, 25, 33, 41
		 */
		
		Set<Integer> lottoSet = new TreeSet<>(); //Tree는 자동적으로 오름차순 정렬을 해줌.
		for (int i = 0; lottoSet.size() < 6; i++) {
			lottoSet.add((int)(Math.random() * 45 +1));
		}
		System.out.println("로또번호 : " + lottoSet);
		System.out.println("로또번호갯수 : " + lottoSet.size());
		
		System.out.println("-------------------------");
		lottoSet.clear();
		while (lottoSet.size() < 6) { //set 데이터가 6개 될 때까지
			lottoSet.add((int)(Math.random() * 45 +1));
		}
		System.out.println("로또번호 : " + lottoSet);
		System.out.println("로또번호 갯수 : " + lottoSet.size());
		
//		System.out.println("==========로또번호 정렬(오름차순)=========");
//		ArrayList<Integer> list = new ArrayList<>(lottoSet);
//		Collections.sort(list);
//		
//		System.out.println("금주의 로또번호 : " + list);
	
	}

}