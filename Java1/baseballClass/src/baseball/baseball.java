package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class baseball {
	// member변수 = 2개의 함수 이상에서 사용하는 값
	int rnum[];
	int unum[];
	boolean clear;
	int count;
	
	// 초기화
	public void init() {
		rnum = new int[3];
		unum = new int[3];
		clear = false;
		
		count = 1;
		
		random();
	}
	
	// 랜덤 수
	public void random() {
		boolean swit[] = new boolean[10];
		int r,w;
		
		for (int i = 0; i < swit.length; i++) swit[i] = false;
		w=0;
		
		while(w<3) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r] = true;
				rnum[w] = r+1;
				w++;
			}
		}
		System.out.println(Arrays.toString(rnum));
	}
	// 유저 입력
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < unum.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력: ");
			unum[i] = sc.nextInt();
			
		}
		
	}
	
	
	
	// 판정
	public boolean finding() {
		int strike, ball;
		strike = ball = 0;
		boolean c = false;
		
		for (int i = 0; i < unum.length; i++) {
			for (int j = 0; j < unum.length; j++) {
				if(unum[i] == rnum[j] && i != j){
					ball++;
				}
			}
		}
		for (int i = 0; i < unum.length; i++) {
			if(unum[i] == rnum[i]){
					strike++;
			}
		}
		if(strike>2) {
			return true;
		}
		
		System.out.println(strike + "스트라이크" + " " + ball + "볼입니다");
		return false;
	}
	
	
	// 루프
	public void loop() {
		int w=0;
		
		while(w<10) {
			userinput();
			clear = finding();
			if(clear==true)	break;
			w++;
			count++;
		}
	}
	
	
	// 출력
	public void result() {
		if(clear) {
			System.out.println("game clear");
			System.out.println("시도 횟수: " + count + "회");
		}
		else System.out.println("game over");
	}
	

}