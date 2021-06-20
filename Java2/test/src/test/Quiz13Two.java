package test;

import java.util.Scanner;

public class Quiz13Two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("학생수를 입력하시오>>> ");
		int student = sc.nextInt();
		
		int array[] = new int[student];
		int score = 0;
		int sum = 0;
		double avg = 0;
				
		for(int i = 0; i < student; i++ ) {
			System.out.println("점수를 입력하시오>>> ");
			score = sc.nextInt();
			sum += score;
			avg = (double) sum / student;
		}
		System.out.println("점수의 총합: " + sum);
		System.out.printf("평균 점수: %.2f " , avg);

	}

}
