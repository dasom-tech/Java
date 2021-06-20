package cls;

public class MyClass {
	
	private int number;
	private String name;
	
	public MyClass() {
		System.out.println("MyClass MyClass()");
	}
	public MyClass(int number) {
		this();
		
		this.number = number;
		System.out.println("MyClass MyClass(int number)");
	}
	public MyClass(int number, String name) {
		this(number);
		
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number, String name)");
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
