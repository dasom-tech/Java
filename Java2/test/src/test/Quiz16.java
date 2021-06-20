package test;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력하고싶은 구구단>>> ");
		
		int inputNum = sc.nextInt();
		
		for(int i = 1; i <10; i++) {
			System.out.printf("%d X %d = %d ",inputNum, i, (inputNum * i));
			}
	}
}
