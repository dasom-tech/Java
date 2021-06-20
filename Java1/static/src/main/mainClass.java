package main;

public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		 	static : 정적
		 	
		 			 stack 	heap 	static 	sys
		 			  지역변수    동적할당	정적영역			
		 
		 
		 */
		
		MyClass.staticVar = 12;
		
		/*
		MyClass c = new MyClass();
		c.method();
		c.method();
		c.method();
		*/
		
		MyClass cls = new MyClass();
		cls.method();
				
		MyClass.staticMethod();
		
		MyClass mcls = MyClass.getInstance();
		
	}

}
