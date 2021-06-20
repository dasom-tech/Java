package overload;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Over Load: 함수(메소드)명은 같고
		 			       매개 변수의 자료형이나 개수가 다른 것으로 분류하는 것을 의미한다.
		 			   
		 	ex) image draw
		 	RGB		-> 배경
		 	RGBA	-> 캐릭터
		 	
		 	imageDraw(int x, int y, int a)
		 	imageDraw(int x, int y)
		 	
		 */
		funcName();
		funcName(123);
		funcName('A');
		funcName('B', 234);
		funcName(345, 'C');
	}
	static void funcName() {
		System.out.println("funcName() 호출");
	}
	
	static void funcName(int i) {
		System.out.println("funcName(int i) 호출");
	}
	
	static void funcName(char c) {
		System.out.println("funcName(char c) 호출");
	}
	
	static void funcName(char c, int i) {
		System.out.println("funcName(char c, int i) 호출");
	}
	
	static void funcName(int i, char c) {
		System.out.println("funcName(int i, char c) 호출");
	}
	
	// static void funcName(char c11) { //가인수만 다름/안됨
	// }
	
	/*
	static int funcName() {  //리턴값으로 구분 할 수는 없음.
		return 1;
	}
	*/

}
