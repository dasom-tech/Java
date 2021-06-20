package card;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//카드 : 0 ~ 51
		/*
		   1 ~ 10 J  Q  K * 4
		          11 12 13
		   0 ~ 12 : 스페이드
		   13 ~ 25 : 다이아
		   26 ~ 38 : 하트
		   39 ~ 51 : 클로버
		   출력
		   0 -> 스페이드 A
		   1 -> 스페이드 2		   
		   51 ->클로버 K   
		  
		 */
		
		// 선언
		char alpha[] = {'A', 'J', 'Q', 'K'};
		int num[] = null;
		int u_num = 0;
		
		// 초기화
		num = new int[51];
		
		// user input
		System.out.println("카드를 뽑으세요(0~51 사이 숫자 입력)>>> ");
		u_num = sc.nextInt();
		
		// 판정
		
		
		// 메세지 출력
		
		

	}

}
