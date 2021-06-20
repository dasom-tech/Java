package childOne;

import parents.Parents;

public class ChildOne extends Parents {
	
	public void method() {
	  //super.method(); // 부모클래스의 메소드가 호출됨. 흡족하지 못해서 추가 기입을 위해 오버라이딩 해줌
		System.out.println("ChildOne OverRide method()");
	}
	
	public void ChildOneMethod() {
		System.out.println("ChildOne ChildOneMethod()");
	}

}
