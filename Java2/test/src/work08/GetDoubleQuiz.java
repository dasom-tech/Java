package work08;

public class GetDoubleQuiz {

	public static void main(String[] args) {
		int num1[] = {1,2,3,4,5};
		getDouble(num1);
		
		for (int i : num1) {
			System.out.print(i + " ");
		}
	}

	static void getDouble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}		
	}
}
