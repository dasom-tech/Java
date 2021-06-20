package main;

public class MyClass {
	
	private int memberVar;	// 멤버변수
	static int staticVar;	// 정적변수	== global(전역)
	
	public void method() {
		int localVar = 0;		// 지역변수
		localVar++;
		memberVar++;
		staticVar++;
		
		System.out.println("지역변수: " + localVar);
		System.out.println("멤버변수: " + memberVar);
		System.out.println("정적변수: " + staticVar);
	}
	
	public void func() {
		System.out.println("func");
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod() 호출");
		
		// this랑 super 사용 불가
	}
	
	public static MyClass getInstance() {
		MyClass c = new MyClass();
		c.func();
		return c;
	}

}
