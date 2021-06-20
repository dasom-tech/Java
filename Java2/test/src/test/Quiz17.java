package test;

public class Quiz17 {

	public static void main(String[] args) {
		
		int oddSum = 0;
		int addSum = 0;
		
		for(int i = 1; i <= 100; i++) {			
			if(i % 2 == 0) {
				addSum += i;
			}else {
				oddSum += i;
			}
		}
		System.out.println("1부터 100 사이 짝수의 합: " + addSum);
		System.out.println("1부터 100 사이 홀수의 합: " + oddSum);
	}
}
