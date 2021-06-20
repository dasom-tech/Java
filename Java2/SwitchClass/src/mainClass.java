
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 
		  switch : 조건문으로 값이 명확해야 한다.
		     가독성
		  
		  switch(변수) {
		       case 값1:
		                           처리
		            break;
  		       case 값2:
		                           처리
		            break;
		       default:
		                           처리
		            break;

		  }
		  
		  > < >= == != 부등호 사용 불가
		    소수는 변수 값으로 사용 불가		 
		 
		 */
		
		int num = 4;
		
		switch(num) {
		
		    case 1:
		    	System.out.println("num은 1입니다");
		    	break;
		    	
		    case 2:
		    	System.out.println("num은 2입니다");
		    	break;
		    case 3:
		    	System.out.println("num은 3입니다");
		    	break;
		    default:
		    	System.out.println("num은 ?입니다");
		
		}
		
		char c = '가';
		switch (c) {
		   case '가':
			   System.out.println("c는 가 입니다");
			   break;

		   default:
			   break;
		}
		
		String str = "hello";
		
		switch(str) {
		   case "hello":
			   System.out.println("str = hello");
			   break;
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
