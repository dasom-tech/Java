package work04;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// random number 찾기
		/*
		  랜덤 숫자(1~100)
		  유저 입력-> 1~100
		  
		  랜덤 숫자와 비교 (기회는 10번)
		  ex) 랜덤 77  유저 50
		  "너무 작습니다."
		                           유저 75
		  "너무 작습니다."
		                           유저 85
		  "너무 큽니다."
		  
		  맞추면 "정답입니다." 탈출
		 
		*/
				int r_num, u_num;
				boolean clear;
				int i;
				String replay;
				
				while(true) {
				
					// initialize
					clear = false;
					i = 0;
					
					// 1. random 수를 취득(1 ~ 100)
					r_num = (int)(Math.random() * 100) + 1;
					System.out.println("r_num:" + r_num);
					
					//////////////////////////////////////// loop start
					while(i < 10) {
					
						// 2. user input(1 ~ 100)
						while(true) {		
							System.out.print("숫자 입력 = ");
							u_num = sc.nextInt();
							if(u_num >= 1 && u_num <= 100) {
								break;
							}
							System.out.println("범위를 벗어 났습니다. 다시 입력해 주십시오.");
						}
						
						// 3. 비교(처리)
						int find_num = 0;		// 메시지를 출력하기 위한 용도
						if(u_num > r_num) {
							find_num = 1;
						}else if(u_num < r_num) {
							find_num = 2;
						}else {	// 정답일 경우
							clear = true;
							break;
						}
						
						// 4. 메시지 출력
						switch(find_num) {
							case 1:
								System.out.println("너무 큽니다");
								break;
							case 2:
								System.out.println("너무 작습니다");
								break;
						}
					
						i++;
					}
					//////////////////////////////////////// loop end
			
					// 5. 결과 출력
					if(clear == true) {
						System.out.println("축하합니다. 클리어하셨습니다");
					}else {
						System.out.println("아쉽습니다. 다시 도전하십시오");
					}
					
					System.out.print("play again? (y/n)= ");
					replay = sc.next();
					
					if(replay.equals("n")) {
						System.out.println("안녕히 가십시오.");
						break;
					}else {
						System.out.println("파이팅입니다");
					}
				}

			}
		}