package child;

import parents.ParentsClass;

public class ChildClass extends ParentsClass{
	
	public void parents_method() {	// 오버라이드!!
		System.out.println("ChildClass 추가 기입 parents_method()");
	}

}
