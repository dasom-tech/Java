package wrapperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		   Wrapper Class
		   	일반 자료형을 클래스화 한 것
		 	클래스: 묶음(저장 요소, 함수)
		 	
		   	일반 자료형                              wrapper class
		   	boolean 			Boolean
		   	
		   	byte				Byte
		   	short				Short
		   	int					Integer
		   	long				Long
		   	
		   	float				Float
		   	double				Double
		   	
		   	char				Character
		   	char[]				String
		   	
		   	class(변수, 함수)
		   	
		   			 
		 */
		
		// 숫자 -> 문자열
		String str = 123 + "";
		

		// 문자열 -> 숫자
		int number = Integer.parseInt("123") + 1;
		System.out.println(number);
		
		double dnumber = Double.parseDouble("123.4567");
		System.out.println(dnumber);
		
		// toString(), valueOf()
	    Integer in = new Integer(23);   //int n = 23;
	    
		// String tostr = in.toString();
		// String tostr = in + "";
		String tostr = String.valueOf(in);
		System.out.println("tostr = " + tostr);

	}
}
