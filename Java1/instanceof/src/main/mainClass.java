package main;

import childOne.ChildOne;
import childTwo.ChildTwo;
import parents.Parents;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 	instanceOf : instance를 구별하기 위한 키워드

		 */
		
		Parents arrPar[] = new Parents[3];
		
		arrPar[0] = new ChildOne();
		arrPar[1] = new ChildTwo();
		arrPar[2] = new ChildTwo();
		
		for (int i = 0; i < arrPar.length; i++) {
			arrPar[i].method();	// 오버라이드 된 메소드
			
			if(arrPar[i] instanceof ChildOne) {
				((ChildOne)arrPar[i]).ChildOneMethod();
			}else if(arrPar[i] instanceof ChildTwo) {
				ChildTwo t = (ChildTwo)arrPar[i];
				t.ChildTwoMethod();
			}
		}
		
//		ChildOne one = (ChildOne)arrPar[0];
//		one.ChildOneMethod();
		
		if(arrPar[0] instanceof ChildOne) {
			System.out.println("arrPar[0]는 ChildOne으로 생성되었음.");
		}



	}

}
