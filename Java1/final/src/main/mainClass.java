package main;

public class mainClass {
	
	public static void main(String[] args) {
		// final : 제약
		//		       변수, 메소드, 클래스
		final int MAX = 10;		// 변수 -> 상수로 변함
		int num;
		num = MAX;
	}

}

final class SuperClass {			// 상속 금지
	
	public final void method() {	//final 쓰면서 오버라이드 금지됨
		
	}
}

//class ChildClass extends SuperClass { //SuperClass가 final이라서 오버라이드 금지됨
//	public void method() {
//		
//	}
	
//}
