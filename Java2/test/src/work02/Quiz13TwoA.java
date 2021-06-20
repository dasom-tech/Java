package work02;

import java.util.Scanner;

public class Quiz13TwoA {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
					
			System.out.println("학생수를 입력하시오>>> ");
			int student = sc.nextInt();
			
			int array[] = new int[student];
			int score = 0;
			int sum = 0;
			double avg = 0;
					
			for(int i = 0; i < array.length; i++ ) {
				System.out.println((i + 1) + "번째 점수: ");
				array[i] = sc.nextInt();
				sum += array[i];
				avg = (double) sum / student;
			}
			System.out.println("점수의 총합: " + sum);
			System.out.printf("평균 점수: %.2f " , avg);

		}
}
