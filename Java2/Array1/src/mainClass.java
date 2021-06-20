
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 
	   Array : 배열
	                        변수의 확장 기능.
	                        정의: 같은 자료형 변수의 묶음.
	                        관리의 목적을 취한다.
	                        
		       int number;
			   int charPosNum;
			   
			      관리 요소 : index number == 숫자
			           0 ~ (n-1)       n = 배열의 갯수
			           
			   int num1, num2, num3, num4, num5
			   
			   
			   형식: 자료형 배열변수명[] = new 자료형[배열의 총 수];
			      int array[] = new int[10];
			                                             동적 할당
			                       
			                    stack -array[]
			                    heap - new int[10]
			                    static
			                    sys                          
			                    
			                                             정적(static)  - 정해진 만큼
			                                             동적(dynamic) - 원하는 만큼
			                                             
			                    array[번지]
			                    
			                    array[0]
			                    array[1]
			                    array[2]
			                      .
			                      .
			                      .
			                    array[9]
			                    
			                                             초기화
			                    int array[] = {1,2,3};   
			                    
			                array 
			                pointer - c에서 사용
			                ex) int *pArr; == int pArr[];
			                
			                CRUD
			                Create
			                Read
			                

	      
		 */
		
		// int array[] = new int[3];  // 0 ~ 2
		// int []array = new int[3];
		   int[] array = new int[3];
		   
		   array[0] = 11;
		   array[1] = 22;
		   array[2] = 33;
		   
		   array[2] = array[0] + array[1];
		   
		   int array2[] = {111, 222,333};
		   
		   int num = 0;
		   // int array3[] = 0; 0으로 초기화 안 됨.
		   int array3[] = null; 
		   //null로 초기화 해야 함
		   
		   char charArr[] = {'A', 'B', 'C'};
		   System.out.println(charArr.length);
		   System.out.println(array2.length);
		   System.out.println(charArr[1]);
		   
		   char charArr1[] = new char[5];		   
		   charArr1[0] = 'h';
		   charArr1[1] = 'e';
		   charArr1[2] = 'l';
		   charArr1[3] = 'l';
		   charArr1[4] = 'o';
		   
		   System.out.println(charArr1);
		   
		   System.out.println(charArr1[0]);
		   System.out.println((int)charArr1[0]); // ASCII 코드 값이 나옴
		   
		
		
		
		
		
		
		
		
		

	}

}
