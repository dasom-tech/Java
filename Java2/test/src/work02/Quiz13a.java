package work02;

public class Quiz13a {

	public static void main(String[] args) {
		
		// 강사님 다른 답

		int sum = 0;
		int count = 1;
		
		for(int i = 0; i < 1000; i++) {
			sum = sum + count;
			count++;
		}
		System.out.println("1부터 1000사이 수의 합: " + sum);
		
		// 짝수만 더하면?
		sum = 0;
		count = 0;
		
		for(int i = 0; i <= 500; i++) {
			sum += count;
			count +=2;
		}
		System.out.println("1부터 1000까지 짝수의 합: " + sum);

	}

}
