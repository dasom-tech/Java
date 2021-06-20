package cast;

public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		   자료형 변환 int -> short   short -> int
		   
		   우선순위(낮->높)
		   
		 boolean
		 
		 byte
		 short
		 int
		 long
		 
		 float
		 double
	   */
		
		//auto(자동 형변환) 작은 그릇 -> 큰 그릇
		short sh = 10;
		int num;
		
		num = sh;
		System.out.println(num);
		
		//cast(강제 형변환)
		sh = (short) num; //큰 그릇 -> 작은 그릇
		System.out.println(num);
		
		float f;
		long l = 1234564256812L;
		
		f = l;
		System.out.println(f);
		
		// E12 == 10의 12승
		// 1.23456428 * 100000000000
		// E-2 == 1/10 * 1/10
		
		double d;
		d =l;
		System.out.println(d);
		
		d = 1.23e-2;
		System.out.println(d);
		
		double tag;
		int num1, num2;
		
		num1 = 3;
		num2 = 2;
		
		tag = (double) num1 / num2;
		System.out.println(tag);
		
		double d1 = 12570.12;
		int result;
		result = (int) d1;
		System.out.println(result);
	
		
	}

}
