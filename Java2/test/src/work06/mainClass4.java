package work06;

public class mainClass4 {

	public static void main(String[] args) {
		/*
		 
		   피보나치 수열은 앞 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
		   예를들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어
		  1,1,2,3,5,8,13,21,...과 같은 식으로 진행된다
		   피보나치 수열의 30번째 수는 무엇인지 계산하는 프로그램을 완성하시오.	 
		 
		 */
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		for(int i = 1; i < 29; i++) {
			num3 = num1 + num2;			
			num2 = num1;
			num1 = num3;	
		}System.out.println(num3);	
	}
}
