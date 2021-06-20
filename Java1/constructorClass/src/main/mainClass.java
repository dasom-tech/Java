package main;

import cls.MyClass;

public class mainClass {
	
	public static void main(String[] args) {
		/*
		 	Constructor :	생성자
		 				 	메소드
		 				 	return 값이 없다
		 				 	Over Load(같은 이름의 함수로 매개변수로 구분)가 가능하다.
		 				 	클래스명과 같은 이름이다.
		 				 	자동 호출된다.(callback)
		 				 	클래스 생성시에 호출
		 				 	생략이 가능하다.
		 				 	
		 	Destructor :	소멸자(C++)
		 					반드시 한 개
		 					java에는 없음
		 							 	
		 */
		int array[] = {1, 2, 3};
		
		/*
		Student stu = new Student();
		stu.setName("홍길동");
		stu.setNumber(123);
		*/
		// Student stu = {"홍길동", 123};
		
		//MyClass cls = new MyClass();
		
		//cls.setNumber(1001);
		//cls.setName("홍길동");
		
		//MyClass cls1 = new MyClass(12);
		
		//MyClass cls2 = {13, "일지매"}; //이렇게 초기화는 안 됨
		MyClass cls2 = new MyClass(13, "일지매");
		
		// final
		final int num = 12; // 변수 -> 상수
		int n;
		n = num;
		
		// num = 34; error
	}

}














