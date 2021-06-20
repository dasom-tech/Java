package test;

public class Quiz15 {

	public static void main(String[] args) {
		
		int num1 = 0;
		
		for(int i = 1; i < 10; i++) {
			for(int j =1; j < 10; j++) {
				num1 = i * j;
				System.out.printf(" %d X %d = %d",i, j, num1);
			}
			System.out.println();
		}
		

	}

}
