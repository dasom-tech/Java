package continueClass;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		    continue : skip(생략)
		                                  다음 처리를 생략
		               for, while, do while과 함께 사용
		               
		    loop { ->for나 while
		                    처리1
		                    처리2
		         if continue;
		                    처리3
		    }
		    
		 */
		
		
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			System.out.println("for start");
			
			if(i == 3) {
				continue;
			}
			
			System.out.println("for end");
		}
		
		int datas[] = {90, 85, -12, 70};
		int sum = 0;
		
		for(int i = 0; i < datas.length; i++) {
			if(datas[i] < 0) {
				continue;
			}
			sum += datas[i];
		}
		System.out.println("sum = " + sum);
		*/
		
		Scanner sc = new Scanner(System.in);
		// 입력 받아야 하는 경우(음수는 입력 불가)
		/*
		int numArr[] = new int[5];
		int num;
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 수 = ");
			num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("음수입니다");
				continue;
			}
			numArr[i] = num;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}
		*/
		
		
		// while문의 경우
		int arrNum[] = new int[5];
		int number;
		int w = 0;
		
		while(w < 5) {
			System.out.print((w + 1) + "번째 수 = ");
			number = sc.nextInt();
			
			if(number < 0) {
				System.out.println("음수입니다");
				continue;
			}
			arrNum[w] = number;
			
			w++;
		}
		
		w = 0;
		while(w < arrNum.length) {
			System.out.println("arrNum[" + w + "] = " + arrNum[w] );
			w++;
		}
		
		
		
		
		
		
		
	}
}
