package function1;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	function : 함수. 독립적인 process.
		 	method 	 : 함수. class에 소속되어 있는 함수.
		 			       복잡한 처리를 간결히 정리할 수 있다.
		 			       중복된 처리를 정리하고 호출할 수 있다.
		 			  
		 	형식:
		 	
		 		return값(자료형) 함수명( 인수, 인자, parameter, 가상인수, 매개변수 )
		 		{
		 			처리
		 			
		 			return 값;		<- 없는 경우도 있음
		 		}
		 		
		 		return값: char, int, double, String, void 등
		 		
		 		// 돌아오는 값    // 들어가는 값
		 		int funcName(char c, double d) {
		 			
		 			처리 logic
		 			
		 			return 정수;
		 		}
		 		
		 		int r;
		 		r = funcName('A', 123.4567);
		 			 
		 */
		
		func1();
		
		func2("hello");
		
		double d = func3();
		System.out.println("d = " + d);
		
		int r = func4(12.34);
		System.out.println("r = " + r);
		
		// ASCII Code 값 알아보기
		int asc = func5('A');
		System.out.println("asc = " + asc);
		
		int array[] = {2, 4, 6};
		int r1 = func6(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] =" + array[i]);
		}
		
		int arr[] = {11, 22, 33};
		int alias[] = arr;
		
		int n;
		int arr1[] = new int[1];
		
		n = 1;
		arr1[0] = 1;
		
		func7(n, arr1);
		
		System.out.println("n= " + n);
		System.out.println("arr1[0]= " + arr1[0]);
		
		int r_array[];
		
		r_array = func8(2);
		for (int i : r_array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int re_array[] = new int[10];
		func9(2, re_array);
		
		for (int i : re_array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	static void func1() {
		System.out.println("1.23");
	}
	
	static void func2(String s) { //s :매개변수, 가상인수
		System.out.println("func2호출 s= " + s);
	}
	
	static double func3() {
		System.out.println("func3 호출>>>");
		
		return 1.23;
	}
	static int func4(double d) {
		System.out.println("func4 호출");
		d *= 10;
		return (int)d;
	}
	
	static int func5(char c) {
		return (int)c;
	}
	
	static int func6(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println("arr[" + i + "] =" + arr[i]);
			
			arr[i] = arr[i] / 2;
			System.out.println("arr[" + i + "] =" + arr[i]);
		}
		return 1;
	}
	
	static void func7(int n, int arr[]) {
		n *= 2;
		arr[0] *= 2;
		
		System.out.println("n= " + n);
		System.out.println("arr[0]= " + arr[0]);
	}
	
	static int[] func8(int n) {	//n =2 -> 구구단 2단 리턴되서 넘어오기
		int r_arr[] = new int[10];
		for (int i = 1; i <= r_arr.length; i++) {
			r_arr[i - 1] = n * i;
		}
		return r_arr;
	}
	static void func9(int n, int r_arr[]) {
		for (int i = 1; i <= r_arr.length; i++) {
			r_arr[i - 1] = n * i;
		}
	}
	
	
	

}


