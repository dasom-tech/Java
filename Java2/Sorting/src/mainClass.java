import java.util.Arrays;

public class mainClass {

	public static void main(String[] args) {
		/*
		    java < oracle
		    
		    Sorting : 정렬
		    		    숫자의 크기에 따라서 순번대로 배치하는 처리
		    		    오름차순 정렬, 내림차순 정렬
		    		    
		      	1 5 2 4 3 -> 1 2 3 4 5  or 5 4 3 2 1 
		 
		    	선택, 버블, 합병, 퀵
		    	
		    	정렬, 셔플, 트리, 탐색		 
		 
		 */
		
		int number[] = {1,5,2,4,3};
		
		// 선택 정렬
		int temp;
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// 오름차순
				if(number[i] > number[j]) {
					// swap
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		 // System.out.println(Arrays.toString(number));
		}
	
	}
}
