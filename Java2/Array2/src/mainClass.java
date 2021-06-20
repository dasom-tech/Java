
public class mainClass {

	public static void main(String[] args) {
		
		/*
		   1차원 배열
		   Array : 같은 자료형 변수들의 묶음.
		   			index number로 관리된다.
		   			int arr[] = new int[배열의 총 수];
		   			
		   			int arr[] = new int[3];
		   			int arr[] = {1, 2, 3};
		   			
		   			String member[] = {"홍길동", "24", "서울시"};
		   			int age = Integer.parseInt(member[1]);
		   			
		   2차원 배열
		   1차원 배열을 다수 관리 할 수 있는 배열
		   
		   			int array2[3][4] = new int[3][4];
		   			
		   			int array2[][] = {
		   				{1,2,3,4},
		   				{5,6,7,8},
		   				{9,10,11,12}
		   			};		 
		 
		 */
		
		 int array[][] = new int[3][];
		 int row1[] = {1,2,3};
		 int row2[] = {2,3,4,5};
		 
		 array[0] = row1;
		 array[1] = row2;
		 array[2] = row1;
		 
		 for (int i = 0; i < array.length; i++) {
			 for (int j = 0; j < array[i].length; j++) {
				 System.out.print(array[i][j] +" ");
			}
			 System.out.println();			
		}
		 
		 char cArr[][] = {
				 {'A','B','C'},
				 {'D','E','F'}
		 };
		 
		 for (int i = 0; i < cArr.length; i++) {
			 for (int j = 0; j < cArr[i].length; j++) {
				System.out.println(cArr[i][j] + " ");
			}
			 System.out.println();
			
		}
		 
		int array2[][] = new int[3][2];
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[1][0] = 21;
		array2[1][1] = 22;
		array2[2][0] = 31;
		array2[2][1] = 32;
		
		// alias -> pointer
		int array1[] = {111, 222, 333};
		int alias[] = array1;
		
		for (int i = 0; i < alias.length; i++) {
			System.out.println(alias[i]);
		}
		
		alias[1] = 200;
		System.out.println(array1[1]);
		
		// foreach
		for(int n : array1) {
			System.out.println("n = " + n);
		}
		
		// 2차원 선언
		int arr3[][] = new int[2][1];
		
		// 값을 대입
		arr3[0][0] = 30;
		arr3[1][0] = 50;
						
		// 출력
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}

	}

}
