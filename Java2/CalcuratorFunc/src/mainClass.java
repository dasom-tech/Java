import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 계산기
		int num1, num2, result = 0;
	  //String snum1, snum2;
		String oper;
		   
		//1. 첫번째 수 입력(숫자인지 아닌지?)
		num1 = inputNumber("첫번째");
		/*
		while(true) {
			System.out.print("숫자를 입력해주세요>>> ");
			snum1 = sc.next();
			
			boolean ok = true;
			for (int i = 0; i < snum1.length(); i++) {
				char c = snum1.charAt(i);
				int asc = (int)c;
				
				if(asc < 48 || asc > 57) {
					System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>>");
					ok = false;
					break;
				}
			}
			if(ok == true) {
				break;
			}
		}
		*/
		
		//2. 연산자(정확히 연산자인지?)
		oper = inputOperator();
		/*
		while(true) {
			System.out.println("연산자(+,-,*,/) = ");
			oper = sc.next();
			
			/*if(oper.equals("+") || oper.equals("+") || oper.equals("*") || oper.equals("/")) {
				break;
			}else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>> ");
			}
			if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>> ");
				continue;
			}
			break;
		}*/
	
	
		//3. 두번째 수 입력(숫자인지 아닌지?)
		num2 = inputNumber("두번째");
		/*
		while(true) {
			System.out.print("숫자를 입력해주세요>>> ");
			snum2 = sc.next();
			
			boolean ok = true;
			for (int i = 0; i < snum2.length(); i++) {
				char c = snum2.charAt(i);
				int asc = (int)c;
				
				if(asc < 48 || asc > 57) {
					System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>>");
					ok = false;
					break;
				}
			}
			if(ok == true) {
				break;
			}
		}
		
		num1 = Integer.parseInt(snum1);
		num2 = Integer.parseInt(snum2);
		*/
		
		//4. 연산처리
		result = numberProc(num1, num2, oper);
		/*
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 = num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2 != 0) {
					result = num1 / num2;
				}
				break;
		}
		*/
		
		//5. 결과출력
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);


	}
	static int inputNumber(String str) {
		Scanner sc = new Scanner(System.in);
		String snum;
		int rnum;
		
		while(true) {
			System.out.print(str + "number>>> ");
			snum = sc.next();
			
			boolean ok = true;
			for (int i = 0; i < snum.length(); i++) {
				char c = snum.charAt(i);
				int asc = (int)c;
				
				if(asc < 48 || asc > 57) {
					System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>>");
					ok = false;
					break;
				}
			}
			if(ok == true) {
				break;
			}
		}
		rnum = Integer.parseInt(snum);
		return rnum;
	}
	static String inputOperator() {
		Scanner sc = new Scanner(System.in);
		String oper = "";
		
		while(true) {
			System.out.println("연산자(+,-,*,/) = ");
			oper = sc.next();
			
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				break;
			}else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오>>> ");
				continue;
			}
		}
		return oper;
	}
	
	static int numberProc(int n1, int n2, String op) {
		 int result = 0;	
		 switch(op) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			case "/":
				if(n2 != 0) {
					result = n1 / n2;
				}
				break;
		}
		 return result;
	}

}
