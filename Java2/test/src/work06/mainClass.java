package work06;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		// 입력된 문자열이 모두 숫자인지 확인하는 코드를 작성해라
		/*
		   String "12345"  -> 모두 숫자입니다.
		          "123a4"  -> 숫자가 아닙니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 문자열을 작성해주세요~>>> ");
		String user = sc.next();
		
		// 문자열의 길이
		int num = user.length();
		
		/* 하나만 확인해볼 때
		char c = user.charAt(0);
		int ascCode = (int)c;
		
		if(ascCode >= 48 && ascCode <= 57) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		*/
		
		boolean b = false;
		for(int i = 0; i < num; i++) {
			
			char c = user.charAt(i);
			int ascCode = (int)c;
			if(ascCode < 48 || ascCode > 57) {
				b = true;
				break;
			}
		}
		
		if(b == true) {
			System.out.println("문자가 포함되어 있습니다.");
		}else {
			System.out.println("모두 숫자입니다.");
		}
	

	
	}

}
