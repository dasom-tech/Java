package sortingwork;

public class Quiz3 {

	public static void main(String[] args) {
		
		char[] abcCode = {  // a ~ z
				'`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',    
				'}',';',':',',','.','/'};
		
						// 0 1 2 3 4 5 6 7 8 9  
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'}; 
		
		// 암호화
		String originalCode = "abc012";  
		String resultCode = "";    
		
		// 문자열 originalCode의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장  
			for (int i = 0; i < originalCode.length(); i++) {
				char c = originalCode.charAt(i);
				int asc = (int)c;
					
			
			// 알파벳인 경우
			if(asc >= 97 && asc <= 122) {  // 97 ~ 122  -> 0 ~ 25
				asc = asc - 97;
				resultCode += abcCode[asc];
			}
			
			// 숫자인 경우
			if(asc >= 48 && asc <= 57) {  // 48 ~ 57  -> 0 ~ 9
				asc = asc - 48;
				resultCode += numCode[asc];
			}
		}		   
		System.out.println("originalCode: " + originalCode);	
		System.out.println("resultCode:"+resultCode);
		
		// 복호화
		String baseCode = "";
		
		for (int i = 0; i < resultCode.length(); i++) {
		
			char c = resultCode.charAt(i);
			int _asc = (int) c;
			
			if(_asc >= 97 && _asc <= 122) {  // 암호화 된 숫자
				int index = 0;
				for (int j = 0; j < numCode.length; j++) {
					if(c == numCode[j]) {
						index = j;
						break;
					}
				}
				// 48 ~ 57까지로 다시 바꿔줘야 함
				index += 48;
				baseCode += (char) index;
				
			}else {						     // 암호화 된 알파벳
				int index = 0;
				for (int j = 0; j < abcCode.length; j++) {
					if(c == abcCode[j]) {
						index = j;
						break;
					}
				}
				// 97 ~122
				index += 97;
				baseCode += (char) index;
			}
		}
		System.out.println("baseCode: " + baseCode);

	}

}
