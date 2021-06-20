package testCls;

public class YouClass {
	
	MyClass mcls;

	public YouClass() {
	}
	
	public YouClass(int num, String name) {
		System.out.println("YouClass num = " + num);
		System.out.println("YouClass name = " + name);
	}
	
	public YouClass(MyClass mcls) {
		
		this.mcls = mcls;
		
		
	}
	
	public void method() {
		System.out.println("YouClass num = " + mcls.number);
		System.out.println("YouClass num = " + mcls.name);
	}
}
