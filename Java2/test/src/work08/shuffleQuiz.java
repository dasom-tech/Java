package work08;

public class shuffleQuiz {
	
	//(1) shuffle메소드를 작성하시오.
	static int[] shuffle(int[] arr) {
		for (int i = 0; i < 1000; i++) {
			int j = (int)(Math.random() * arr.length);
			int j1 = (int)(Math.random() * arr.length);

			int tmp = arr[j];
			arr[j] = arr[j1];
			arr[j1] = tmp;
		}
		return arr;
	}
	
	//리턴 필요 없는 함수
	static void shuffle2(int[] arr) {
		for (int i = 0; i < 1000; i++) {
			int j = (int)(Math.random() * arr.length);
			int j1 = (int)(Math.random() * arr.length);

			int tmp = arr[j];
			arr[j] = arr[j1];
			arr[j1] = tmp;
		}
	}
	
	public static void main(String[] args) {
			
		int[] original = {1,2,3,4,5,6,7,8,9};   
		System.out.println(java.util.Arrays.toString(original));   
		
		// int[] result = shuffle(original); 
		// System.out.println(java.util.Arrays.toString(result)); 
		shuffle2(original);
		System.out.println(java.util.Arrays.toString(original)); 
	
	}
}
