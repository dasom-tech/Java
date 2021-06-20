
public class mainClass1 {

	public static void main(String[] args) {
		
		int num1;     // local(지역) variable, auto
		
		for (int i = 0; i <10; i++) {
			
		}
		
		{
			int num2;   // local variable
			num1 = 23;  // memory : stack, heap, static, system 영역
		}

		num1 = 24;
		// num2 = 23; 중괄호 벗어나서 사용 불가  
		
		// 변수
		// 숫자형
		byte b;
		short s;
		int i;
		long l = 12251554L;
		
		float f = 123.4567f;
		double d = 123.456789;
		
		/*
		 
		 app(window) == web(browser)
		 
		 관리프로그램
		 oracle <- java -> web
		                   html, JavaScript, CSS 등
                           JSP -> Vue, React		 
		 
		 */
		
		
		
		// 문자형
		char c = '한';
		
		String str = "hello"; //Wrapper class : 자료형을 쓰기 편하게 클래스로 해 놓은 것		
		String str1 = new String("hello");
		
		str = str + " world";
		str1 = str.concat(" world");
		
		// 논리형
		boolean b1 = true;
		
		

	}

}
