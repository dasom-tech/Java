
public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		 Operator
		 +, -, *, /, %
		*/
		
		int num1, num2;
		int result;
		
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// "/
		System.out.println("\"hello\" \\ \"world\"");
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		// 주의점
		// /, % = 분모가 0이 되면 안 됨. 0으로 나눌 수 없음.
		num2 = 0;
//		result = num1 / num2;
//		System.out.println(num1 + " / " + num2 + " = " + result);
		
//		result = num1 % num2;
//		System.out.println(num1 + " % " + num2 + " = " + result);
		
		// 연산 중 1위
		int n = 0;
		n = n + 1;  // 자기 자신(n)을 갱신
		System.out.println("n = " + n);
		n += 1;
		System.out.println("n = " + n);
		
		// increment(증가), decrement(감소)
		n = 0;
		
		n++;   // == n+1
		++n;   // == n+1
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		--n;
		System.out.println("n = " +n);
		
		int num;
		num = 1;
		
		int tag;
		
		//num++;
		//tag = num++;
		//tag = ++num;
		tag = (num++); // 괄호 쓰더라도 대입이 먼저 실행됨
		
		System.out.println("tag = " + tag);
		System.out.println("num = " + num);
				
	}

}
