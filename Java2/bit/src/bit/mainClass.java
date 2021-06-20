package bit;

public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		  bit : 0 , 1
		  
		  &  AND
		  |  OR
		  ^  XOR
		  << left shift
		  >> right shift
		  ~  반전		 
		 
		 */
		
		int result;
		
		// AND       1011 1100 -> 16진수로 먼저 바꾼다
		//           8421 8421 -> 11 / 12니까 B / C
		//           1100 1001 -> C / 9
		//       결과   1000 1000 -> 8 / 8
		
		result = 0xBC & 0xC9;
		System.out.println(result); // ->10진수 출력
		System.out.printf("%x \n", result); // ->16진수 출력
		
		
		/*
		 
		 0x5D | 0xE3
		 
		 5D =
		 0101 1101
		 8421 8421
		 
		 E3 =
		 1110 0011
		 8421 8421
		 
		 결과 1111 1111
		   8421 8421
		   F    F
		 */
		
		result = 0x5D | 0xE3;
		System.out.println(result);
		System.out.printf("%x \n", result);
		
		/*
		 
		 0x37 ^ 0xAB
		 
		 37 =
		 0011 0111
		 8421 8421
		 
		 AB =
		 1010 1011
		 8421 8421
		 
		 결과 1001 1100
		    8421 8421
		    9    C
		    
		 
		 */
		result = 0x37 ^ 0xAB;
		System.out.println(result);
		System.out.printf("%x \n", result);
		
		// ~ 반전   0 -> 1 1 -> 0
		byte by = ~0x55;    // 0101 0101 반전시킴
		                    // 1010 1010
		                    // 8421 8421
		                    // A    A
		System.out.printf("%x \n", by);
		
		/*
		  left shift
		  
		  1010 1100 10진수로는 *2한 결과가 나옴
		 10101 1000 한 칸씩 왼쪽으로 이동
		 
		  right shift
		  
		  1000 => 8 10진수로는 /2한 결과임
		   100 => 4 한 칸씩 오른쪽으로 이동
		 
		 
		 */
		
		byte by1;
		
		by1 = 0x1 << 1;
		System.out.println(by1);
		
		by1 <<= 1;
		System.out.println(by1);
		
		by1 >>= 1;
		System.out.println(by1);
		
		
	}

}
