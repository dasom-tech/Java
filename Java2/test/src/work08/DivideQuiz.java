package work08;

public class DivideQuiz {

	public static void main(String[] args) {
		int num1, num2;
		int result, tag[] = new int[1];
		num1 = 9;
		num2 = 2;
		
		result = getResult(num1, num2, tag);
		System.out.println("몫: " + result);
		System.out.println("나머지: " + tag[0]);
	}
	
	static int getResult(int num1, int num2, int t[]) {
		int result = num1 / num2;
		t[0] = num1 % num2;
		
		return result;
	}

}
