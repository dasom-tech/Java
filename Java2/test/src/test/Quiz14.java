package test;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력>>> ");
		int num = sc.nextInt();
		
		if(num > 0 && num <= 10) {
			System.out.println("입력한 수는 0보다 크고 10보다 작거나 같다");
		}else if(num > 10 && num <= 20) {
			System.out.println("입력한 수는 10보다 크고 20보다 작거나 같다");
		}else if(num > 20 && num <= 30) {
			System.out.println("입력한 수는 20보다 크고 30보다 작거나 같다");
		}else if(num > 30 && num <= 40) {
			System.out.println("입력한 수는 30보다 크고 40보다 작거나 같다");
		}else if(num > 40 && num <= 50) {
			System.out.println("입력한 수는 40보다 크고 50보다 작거나 같다");
		}else if(num > 50 && num <= 60) {
			System.out.println("입력한 수는 50보다 크고 60보다 작거나 같다");
		}else if(num > 60 && num <= 70) {
			System.out.println("입력한 수는 60보다 크고 70보다 작거나 같다");
		}else if(num > 70 && num <= 80) {
			System.out.println("입력한 수는 70보다 크고 80보다 작거나 같다");
		}else if(num > 80 && num <= 90) {
			System.out.println("입력한 수는 80보다 크고 90보다 작거나 같다");
		}else if(num > 90 && num <= 100){
			System.out.println("입력한 수는 90보다 크고 100보다 작거나 같다");
		}else {
			System.out.println("입력한 수는 0이다");
		}


		

	}

}
