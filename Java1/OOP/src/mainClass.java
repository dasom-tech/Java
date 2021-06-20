
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 	Object Oriented Programming
		 	객체		지향		
		 	
		 	절차지향
		 	
		 	선언(변수, 배열) - 50000 line 넘어가면 한계		
		 										1.분산 -> 함수로
		 										2.변수 -> number -> 다시 쓰면 충돌 / 유지 보수 힘듬
		 										3.크기 -> 한계
		 	1. 초기화
		 	2. 랜덤
		 		1)
		 		2)
		 	3. 입력
		 		1)
		 		2)
		 	4. 처리
		 	5. 결과
		 	
		 	// 학생 성적 관리
		 	int student[?][4] = {	// 0 1 2 3 가독성 안 좋음
		 		
		 	}
		 	
		 	student 
		 		name
		 		kor
		 		math
		 		eng
		 	
		 	클래스 정의:
		 	class 클래스명{
		 		변수들
		 		함수들(메소드들)		 		
		    }
		    	  stack    Heap
		         클래스명 변수 = new 클래스명();
		          instance == 주체
		          object   == 객체
		 		
		 */
		
		MyClass cls = new MyClass();
		System.out.println(cls);
		
		cls.c = 'A';
		cls.n = 123;
		cls.str = " hello";
		
		MyClass cls2 = new MyClass();
		
		cls2.c = 'B';
		cls2.n = 234;
		cls2.str = "world";
		
		// TV -> 2대
		String name[] = new String[2];
		int channel[] = new int[2];
		boolean power[] = new boolean[2];
		
		name[0] = "samsung";
		name[1] = "LG";
				
		channel[0]= 11;
		channel[1] = 24;
		
		power[0] = true;
		power[1] = false;
		
		System.out.println("메이커:" + name[0] + " " + channel[0] + " " + power[0]);
		System.out.println("메이커:" + name[1] + " " + channel[1] + " " + power[1]);
		
	
		TV tv1, tv2;
		tv1 = new TV();
		tv2 = new TV();
		
		tv1.name = "LG";
		tv1.channel = 11;
		tv1.power = true;
		tv1.print();
		
		tv2.name = "sanmsung";
		tv2.channel = 23;
		tv2.power = true;
		tv2.print();
	}

}

class MyClass{
	char c;
	int n;
	String str;
}

class TV{
	String name;	// member 변수
	int channel;
	boolean power;
	
	void print() {
		System.out.println("메이커:" + name + " " + channel + " " + power);
	}
}
	





















