package test;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
//		int x = 1, y = 2;
//		
//		x = y--;
//		
//		System.out.println("x = " + x + " y = " + y);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1 = ");
		int num1 = sc.nextInt();
		
		System.out.println("num2 = ");
		int num2 = sc.nextInt();
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("x = " + num1 + " y = " + num2);
		
	}

}
