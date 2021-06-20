package testCls;

public class MyClass {
	
	int number;
	String name;
	
	public MyClass() {
		number = 123;
		name = "홍길동";
		
	//	YouClass ycls = new YouClass(number, name);
		
		YouClass ycls = new YouClass(this);
	}

}
