
public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		 
		     제어문
		     
		  - 조건 : if
		           else
		           else if
		         
		         switch
		          case
		            break;
		            
		    형식:
		     if(조건식(논리)){ 조건식= true/false
		                  처리		     
		     }
		     
		     if(number > 0) {
		                  처리
		     }
		     
		     if(number > 0 && number <= 10 && number != 5){
		                  처리
		     }
		     
		     if(true) {
		     
		     }
		     
		     if(조건식) {
		                        
		                        처리1
		                        
		     }
		     else {
		                       
		                       처리2
		                       
		     }
		     
		     if(조건식1){
		                       
		                       처리1
		                       
		     }        
		     else if(조건식2) {
		     
		                       처리2
		                       
		     }
		     else if(조건식3) {
		            
		                      처리3
		          
		     }
		     else {
		                      
		                      처리4
		                      
		     }
		 
		 
		 */
		
		int number = 6;
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		
		if(number >= 6) {
			System.out.println("number는 6보다 크거나 같다");
		}
		
		if(number == 6) {
			System.out.println("number는 6이다");
		}
		
		if(number != 5) {
			System.out.println("number는 5가 아니다");
		}
		
		if(number >= 0 && number < 10) {
			System.out.println("number는 0보다 크거나 같고 10보다 작다");
		}
		
		if(number < 5 || number > 10) {
			System.out.println("number는 5보다 작거나 10보다 크다");
		}
		
		if(number > 10) {
			System.out.println("number는 10보다 크다");
		}else {
			System.out.println("number는 10보다 작거다 같다");
		}
		
		number = 85;
		
		if(number == 100) {
			System.out.println("A++ 입니다");
		}else if(number >= 90) {
			System.out.println("A 입니다");
		}else if(number >= 80) {
			System.out.println("B 입니다");
		}else {
			System.out.println("80점 미만입니다");
		}
		
		// 조건문 안의 조건문
		number = 75;
		
		if(number > 90) {
			
		}else if(number > 80) {
			
		}else if(number > 70) {
			if(number >= 75) {
				System.out.println("합격입니다");
			}else {
				System.out.println("다음 기회를 노리십시오");
			}
		}
		
		
		boolean b;
		
		b = false;
		
		if(b == false) {
			System.out.println("b는 false입니다");
		}
		if(!b) {
			System.out.println("b는 !b입니다");
		}
		
		b = true;
		if(b) {
			System.out.println("b는 true입니다");
		}
	}

}
