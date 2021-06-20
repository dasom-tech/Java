package work01;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 
		 편의점
		 
		 지불해야 할 금액: 3230원
		 자신의 금액:    10000원
		 
		 거스름 돈을 구하시오.(5000원권 몇 장 / 1000원권 몇 장 / 500원 몇 개 / 100원 몇 개 / 50원 몇 개 / 10원 몇 개로 나타내기)
		 		 
		 */
		
//		int price = 3230;
//		int myMoney = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지불해야 할 금액: ");
		int price = sc.nextInt();
		
		System.out.println("가지고 있는 돈: ");
		int myMoney = sc.nextInt();
		
		int change = myMoney - price;
		System.out.println("거스름 돈: " + change);
				
		System.out.println("5000원: " + change / 5000 + "장");
		System.out.println("1000원: " + (change % 5000) / 1000 + "장");
		System.out.println("500원: " + (change % 1000) / 500  + "개");
		System.out.println("100원: " + (change % 500) / 100  + "개");
		System.out.println("50원: " + (change % 100) / 50  + "개");
		System.out.println("10원: " + (change % 50) / 10 + "개");



	}

}
