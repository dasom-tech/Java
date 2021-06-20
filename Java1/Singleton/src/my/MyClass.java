package my;

import single.SingletonClass;

public class MyClass {
	
	private int number;
	
	public MyClass() {
		number = 11;
		
		SingletonClass si = SingletonClass.getInstance(); // 싱글톤 클래스 생성
		si.number = this.number;
	}

	public int getNumber() {
		return number;
	}

}
