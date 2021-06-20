package function2;

public class mainClass {

	public static void main(String[] args) {
		/*
		 		function:   함수
		 			    	들어가는 값-> 인수, 인자, Parameter, 매개변수(가인수)
		 			    	나오는 값-> return 값

		     	나오는 값의 자료형     함수명(들어가는 값(다수))
		    	{
					처리
					
					return	나오는 값
		     	}
		 			    
		 */
		// 가변인수
		allocParam(12,23,45);
		
		allocParam(3,6,7,2,1,9);
		
		allocFunc("world", 2, 5, 7, 10);
		
	}
	static void allocParam(int...num) {		//printf("%d",,,)
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum= " + sum);
		
	}
	static void allocFunc(String str, int...num) { // 가변 인수가 뒤에 와야 함
		System.out.println("str = " + str);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
