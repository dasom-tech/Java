package work06;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		//입력받을 수가 정수, 소수인지를 판단하는 코드
		//정수입니다, 소수입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오>>> ");
		String user = sc.next();
		
		int num = user.length();
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			char c = user.charAt(i);
			
			// 문자열인 경우
			if((i == 0 && c == '.') || (i == user.length()-1 && c == '.')) {
				result = 1;
				break;
			}
			// '.'가 있는지?
			if(c == '.') {
				result = 2;
				break;
			}
		}
		
		switch(result) {
			case 0:
				System.out.println("이 숫자는 정수로 되어 있습니다.");
				break;
			case 1:
				System.out.println("문자가 포함되어 있습니다.");
				break;
			case 2:
				System.out.println("이 숫자는 소수입니다.");
				break;
		}

	}

}
