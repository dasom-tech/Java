
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 loop문, 순환문
		  지정된 회수만큼 반복을 처리하는 제어문
		 
		 for((선언)초기화(1); 조건식(2)(5)(8); 연산식(4)(7)) {
		         처리(3)(6)
		 }
		 (9)
		 
		 
		 */
		
		int n;
		
		for(n = 0; n < 10; n++) {
			System.out.println(n);
		}
		System.out.println(n);
		
		// 1 ~ 10까지 더한 수 구하기
		int num1 = 0;
				
		for(n = 1; n <= 10; n++) {
			num1 += n;
		}
		System.out.println(num1);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i = " + i);
		}
		
		for(int i = 0; i <10; i=i+2) {
			System.out.println("i = " + i);
		}
		
		int _num = 0;
		
		for(; _num > 10; ) {
			System.out.println("_num = " + _num);
			_num++;
		}
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
		int n1, n2;
		n1 = 0;
		n2 = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("n1 = " + n1);
			System.out.println("n2 = " + n2);
			n1++;
			n2++;
		}
		
		//2중 for문
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0; j < 5; j++) {
				System.out.println("  j = " + j);				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
