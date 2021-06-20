package work08;

public class IsNumber {
	
	public static void main(String[] args) {
		String str = "123";   
		System.out.println(str+"은 숫자입니까? "+isNumber(str));   
		str = "1234o";   
		System.out.println(str+"은 숫자입니까? "+isNumber(str));   
	}

	static boolean isNumber(String str) {
		boolean b = true;
		
		// 문자가 있을 때
		for (int i = 0; i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			if(asc < 48 || asc > 57) {
				b = false;
				break;
			}
		}
		
		return b;
	} 

}
