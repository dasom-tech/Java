package childone;

import parents.ParentsClass;

public class ChildOneClass extends ParentsClass {
	
	public void parents_method() {	// 오버라이드!!
		System.out.println("ChildOneClass 추가 기입 parents_method()");
	}
	
}
