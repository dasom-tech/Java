package work05;

import java.util.Scanner;

public class mainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		   baseball
		   
		   1 ~ 10 중 숫자를 적어서 보여주지 않고 상대방이 숫자 불러주었을 때 자리는 틀린데 숫자는 맞으면 1 ball
		                                                                                                         자리와 숫자 같으면 1 strike
		                                                                                                         모두 맞추면 out이나 clear
		                                                                                                         
		       1.랜덤 숫자 3개 모두 달라야 함.
		       2.입력 받은 숫자 3개 모두 달라야 함.
		       3.기회는 10번.                                                                        
		       
		 */
		
		// 선언
		//int r_num[] = null; //random number save array
		int r_num[] = {1,2,3,4,5,6,7,8,9}; //2번째 방법에서 사용
		int u_num[] = null;  //user number save array
		boolean clear;
		int strike, ball;
		int gameloop;
		
		boolean swit[] = new boolean[10];  //3번째 방법에 쓰이는 스위치 변수
		
		// TODO: 초기화
		r_num = new int[3];
		//r_num = new int[3];
		u_num = new int[3];
		clear = false;
		gameloop = 0;
		
		for(int i = 0; i < swit.length; i++) {
			swit[i] = false;  //스위치를 off로 초기화
		}
		
		// 1. random 수 3개 취득
		// 1번째 방법
		/*
		while(true) {
		  for(int i = 0; i < r_num.length; i++) {
			 r_num[i] = (int)(Math.random() * 10) + 1;
		  }
		  
		  if(r_num[0] != r_num[1] && r_num[0] != r_num[2] &&
				  r_num[1] != r_num[2]) {
			  break;
		  }
		}*/
		
		/*// 2번째 방법(swap이용)
		
		int r1, r2;
		
		for(int i = 0; i < 1000; i++) {
			r1 = (int)(Math.random() * 10); //0 ~ 9
			r2 = (int)(Math.random() * 10); //0 ~ 9
			
			int temp = r_num[r1];
			r_num[r1] = r_num[r2];
			r_num[r2] = temp;
		}
		
		// r_num[0] ~ r_num[2]
		for(int i = 0; i < r_num.length; i++) {
			System.out.println("r_num[i] = " + r_num[i]);
		}*/
		
		// debug != error
		
		//★★★3번째 방법
		int r, w;
		w = 0;
		
//		swit[0] = true; //이 번호는 안 나오게 하고 싶을 때. 
//		swit[9] = true;
//		swit[32] = true;
//		swit[45] = true;
		
		while(w < r_num.length) {
			r = (int)(Math.random() * 10);  //0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r + 1;           //1 ~ 10
				w++;
			}
		}
		
		for(int i = 0; i < r_num.length; i++) {
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}
						
		// -----------------------loop
		while(gameloop < 10) {
			
		
			// 2. TODO:user input 3개
			while(true) {
				w = 0;
				while(w < 3) {
					System.out.print((w + 1) + "번째 수 = ");
					u_num[w] = sc.nextInt();
					w++;
				}
				
				if(u_num[0] == u_num[1] || u_num[0] == u_num[2] || u_num[1] == u_num[2]) {
					System.out.println("같은 숫자가 있습니다. 다시 입력하세요.");
					continue;
				}
				break;
			}
			
			// 3. finding(판정)
			strike = ball = 0;
			// ball
			for(int i = 0; i < r_num.length; i++) {
				for(int j = 0; j < r_num.length; j++) {
					if(u_num[i] == r_num[j] && i != j) {
						ball++;
					}
				}
			}
			
			// strike
			for(int i = 0; i < r_num.length; i++) {
				if(u_num[i] == r_num[i]) {
					strike++;
				}
			}
			
			// loop 탈출
			if(strike == 3) {
				clear = true;
				break;
			}
			
			// 4. message
			System.out.println(strike + "스트라이크" + ball + "볼 입니다.");
			
			gameloop++;
	}
		
		// 5. result
		if(clear) {
			System.out.println("Game Clear!!!");
		}else {
			System.out.println("Game Over~");
		}
		
		
	 }
}

