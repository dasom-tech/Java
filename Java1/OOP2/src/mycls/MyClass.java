package mycls;

public class MyClass {

	private int number;				// 클래스 내부에서만 접근 가능, 대부분 멤버변수는 private
	public String name;				// 어디서든지 접근 가능
	protected char c;				// 클래스 내부에서만 접근 가능
		
	// Variable 90%가 private으로 되어있음.
	
	/*
	// setter
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	// getter
	public int getNumber() {
		return number;
	}
	*/
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
		
		/*
		 	this : 자기 참조 -> 자기 자신의 주소(Heap)
		 	       0번째 매개변수로 자기 자신을 가리키는 주소		 
		 
		 */
	}
	public MyClass getThis() {
		return this;
	}
	
	public void method() {
		
		// int number = 10; 사용하면 아래 넘버는 로컬변수로 인식됨
		
		number = 12;		// 멤버변수로 인식
		this.number = 14;
		this.setNumber(23);
	}

}













