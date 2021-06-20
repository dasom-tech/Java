package work02;

import java.util.Scanner;

public class Quiz14a {

	public static void main(String[] args) {
		
		// 강사님 다른 답
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력>>> ");
		int num = sc.nextInt();
		
		int n = 0;
		for(int i = 0; i < 100000; i++) {
			n = i * 10; // 0 10 20 30 40 ... 90
			
			if(num > n && num <= (n + 10)) {
				System.out.println("입력한 수는" + n + "보다 크고" + (n+10) + "보다 작거나 같다");
			}
		}
	}
}
