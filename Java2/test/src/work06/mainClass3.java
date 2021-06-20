package work06;

import java.util.Scanner;

public class mainClass3 {

	public static void main(String[] args) {
		// 입력된 알파벳 문자열을 모두 대문자로 변경하는 코드
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("알파벳을 입력하세요>>> ");
//		String input_a = sc.next();
//		
//		String uppStr = input_a.toUpperCase();
//		System.out.println("입력한 알파벳>>> " + uppStr);

		// 강사님 다른 방법
		String strNum = "abcDEF";
		String result = "";
		
		for(int i = 0; i < strNum.length(); i++) {
			
			int asc = (int)strNum.charAt(i);
			
			if(asc >= 65 && asc <= 90) { //대문자인 경우
				result += (char)asc;
			}else {
				asc = asc - 32;
				result += (char)asc;
			}
		}
		System.out.println("원 문자열: " + strNum);
		System.out.println("변환 문자열: " + result);
		
		
	}

}
