
public class mainClass {
	
	public static void main(String[] args) {
		
		// 변수의 종류
		// 숫자형
		// 정수
		byte by;    // 1 byte == 8 bit -> 256개   0 ~ 255    0000 0000  맨 앞 부호비트 0 -> + 1 -> -
		by = 127;   // 127 ~ -128
		System.out.println("by = " + by);
		
		short sh;   // 2 byte
		sh = 1234;
		System.out.println("sh = " + sh);
		
		int i;      // 4 byte
		i = 12232131;
		System.out.println("i = " + i);
		
		long l;     // 8 byte
		l = 123443542124465432L;
		System.out.println("l = " + l);
		
		// 소수
		float f;    // 4 byte
		f = 123.456789f;
		System.out.println("f = " + f);
		
		double d;   // 8 byte
		d = 12345.56789;
		System.out.println("d = " + d);
		
		// 문자형
		// 문자
		char c;     // 2 byte
		c = 'A';    // a ~ z, @ # $ % A ~ Z, 가
		System.out.println("c = " + c);
		c = '+';
		System.out.println("c = " + c);
		c = '한';
		System.out.println("c = " + c);
		
		
		
		// 문자열
		// 문자 + 문자 -> 문자열        Array, String
		String str;
		str = "hello";
		System.out.println("str = " + str);
		
		str = "world";
		System.out.println("str = " + str);
		
		
		
		// 논리형(true/false)      
		boolean b;  // 1 byte
		b = true;   // 1
		b = false;  // 0
		System.out.println("b = " + b);
		
	}

}
