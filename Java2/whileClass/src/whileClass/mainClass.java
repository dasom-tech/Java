package whileClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		  while(순환문)
		  do while
		  
		    형식:
		           변수 선언
		           변수 초기화
		           
		           while(조건식) {
		                                     처리
		                                     연산식
		           }
		           
		           변수 선언
		           변수 초기화
		           
		           do {
		                                    처리
		                                    연산식
		           }while(조건식);
		  		 
		 */
		
		int w;
		w = 0;
		
		while(w < 10) {
			System.out.println("w: " + w);
			w++; //0 ~ 9 까지 나옴
		}
		
		/*
		   init
		   
		   loop -> while 많이 씀
		   
		   release		 
		 
		 */
		
		int w1 = 0;
		do {
			System.out.println("w1: " + w1);
			w1++;
		}while (w1 < 10);
		
		//이중 while문
		int w2, w3;
		w2 = 0;
		w3 = 0;
		
		while(w2 <10) {
			System.out.println("w2: " + w2);
			w3 = 0;
			
			while(w3 < 5) {
				System.out.println(" w3: " + w3);
				w3++;
			}
			w2++;
		}
		
		// 구구단
		// 이중 while문을 사용하여 만들어보시오.
		int i = 2;
		int j = 1;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.println(i + "x" + j + "=" + (i *j));
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
}
