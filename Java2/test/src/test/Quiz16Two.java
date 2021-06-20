package test;

import java.util.Scanner;

public class Quiz16Two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수>> ");
		int num1 = sc.nextInt();
		
		if(num1 == 0) {
			System.out.println("0이 아닌 숫자를 입력하시오>> ");
				num1 = sc.nextInt();
		}
		
		System.out.println("연산자를 선택하시오>> 1.+ 2.- 3.* 4./");
		int myChoice = sc.nextInt();
		
		if(myChoice < 1 || myChoice > 4) {
			System.out.println("1번부터 4번까지중에 고르시오>>> ");
			myChoice = sc.nextInt();
		}
		
		System.out.println("두 번째 수>> ");
		int num2 = sc.nextInt();
		
		if(num2 == 0) {
			System.out.println("0이 아닌 숫자를 입력하시오>> ");
				num2 = sc.nextInt();
		}
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int gop = num1 * num2;
		int division = num1 / num2;
		
		switch(myChoice) {
		   case 1:
			   System.out.printf("%d + %d = %d",num1, num2, sum);
			   break;			   
		   case 2:
			   System.out.printf("%d - %d = %d",num1, num2, minus);
			   break;
		   case 3:
			   System.out.printf("%d * %d = %d",num1, num2, gop);
			   break;
		   case 4:
			   System.out.printf("%d / %d = %d",num1, num2, division);
			   break;
		}
		

	}

}
