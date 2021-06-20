package calculator;

import java.util.Scanner;

public class Calculator {
		
		// num1, num2, operator
		int num1;		// member variable
		int num2;
		String oper;
		int result;
		
		public void input() {	// member method
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 숫자 = ");
			num1 = sc.nextInt();
			
			System.out.println("연산자 = ");
			oper = sc.next();
			
			System.out.println("두번째 숫자 = ");
			num2 = sc.nextInt();
		}
		
		public void process() {
			
			switch(oper) {
				case "+":
					result = num1 + num2;
					break;
				case "=":
					result = num1 - num2; 
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
			}
			
		}
		
		public void result() {
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		}
	}

