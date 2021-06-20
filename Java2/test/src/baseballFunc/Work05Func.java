package baseballFunc;

import java.util.Arrays;
import java.util.Scanner;

public class Work05Func {

	public static void main(String[] args) {
		//baseball 문제 메서드를 이용해서 만들기
		
		int r_num[] = null;
		boolean clear;
				
		// initialize(초기화)		
			// random
		// random(r_num);		
		r_num = random();		
						
		// loop
			// user input
			// finding
			// message
		clear = loop(r_num);
		
		// release
			// result
		resultPrint(clear);	
		
		
	}
	
	static int[] random() {
		boolean swit[] = new boolean[10];
		int w = 0, r;
		int r_num[] = new int[3];
		
		while(w < 3) {
			r = (int)(Math.random() * 10);
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;
				w++;
			}
		}	
		
		System.out.println( Arrays.toString(r_num) );
		
		return r_num;
	}
	
	static boolean loop(int r_num[]) {
		int strike, ball;
		int u_num[] = new int[3];
		boolean clear = false;
		int w = 0;
		
		// loop
		while(w < 10) {
			// user input
			userInput(u_num);
					
			// find
			strike = strikeCheck(u_num, r_num);
			ball = ballCheck(u_num, r_num);
			
			if(strike == 3) {
				clear = true;
				break;
			}
		
			// message
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			w++;
		}
		
		return clear;
	}
	
	static void userInput(int u_num[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < u_num.length; i++) {
				System.out.print((i + 1) + "번째 수 = ");
				u_num[i] = sc.nextInt();
			}
			
			if(u_num[0] != u_num[1] 
				&& u_num[0] != u_num[2] 
					&& u_num[1] != u_num[2]) {
				break;
			}			
			System.out.println("같은 숫자를 입력하셨습니다. 다시 입력하세요");
		}		
	}
	
	static int ballCheck(int u_num[], int r_num[]) {
		int ball = 0;
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < r_num.length; j++) {
				if(u_num[i] == r_num[j] && i != j) {
					ball++;
				}
			}
		}
		return ball;
	}
	
	static int strikeCheck(int u_num[], int r_num[]) {
		int strike = 0;
		for (int i = 0; i < r_num.length; i++) {
			if(u_num[i] == r_num[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	static void resultPrint(boolean clear) {
		if(clear == true) {
			System.out.println("Game Clear!!!");
		}else {
			System.out.println("Game Over~~~");
		}
	}
}