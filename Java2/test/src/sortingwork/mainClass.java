package sortingwork;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int number[] = null;
		boolean updown = false;
		
		// user 몇개를 정렬?
		System.out.println("숫자 몇 개를 정렬하시겠습니까?>>> ");
		
		int count = sc.nextInt();
		
		// 배열 확보
		number = new int[count];
		String strNum[] = new String[count];
					
		// 숫자들 입력(잘못 입력시 다시 입력)
		int w = 0;
		while(w < number.length){
			
			System.out.print((w + 1) + "번째 수 = ");
			strNum[w] = sc.next();
			
			// check 문자/숫자
			boolean b = false;
			for (int i = 0; i < strNum[w].length(); i++) {
				int asc = (int)strNum[w].charAt(i);
				
				if(asc < 48 || asc > 57) {
					b = true;
					break;
				}
			}
			if ( b == true) {
				System.out.println("잘 못 입력하셨습니다. 다시 입력하세요~ ");
				continue;
			}
			
			w++;
	
		}
	
			
		// 올림할래 / 내림할래?
		System.out.print("올림(1) / 내림(2) = ");
		int ud = sc.nextInt();
		if (ud == 1) {
			updown = true;
		}else {
			updown = false;
		}
		
		
		// String ->Integer
		for (int i = 0; i < strNum.length; i++) {
			number[i] = Integer.parseInt(strNum[i]);
		}
		
		// 정렬
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown == true) {		//오름차순
					if(number[i] > number[j]) {
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
				    }
				}else {						//내림차순
					if(number[i] < number[j]) {
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
				    }
				}
			}
		}
		
		// 결과 출력
		for(int n : number) {
			System.out.print(n + " ");
		}

	}

}
