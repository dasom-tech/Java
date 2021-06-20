package funcwork;

import java.util.Arrays;

public class mainClass {

	public static void main(String[] args) {
		
		// 1번 문제. 2차원 배열 -> 1차원 배열
		int array2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int array1[] = null;
		array1 = arr2ToArr1(array2);
		
		System.out.println(Arrays.toString(array1));
		
		/*
		int array1[] = new int[array2.length * array2[0].length];
		
		for (int i = 0; i < array2.length; i++) {				// 0 1 2
			for (int j = 0; j < array2[0].length; j++) {		// 0 1 2 3
				array1[array2[0].length * i + j] = array2[i][j];
			}
			
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		*/

	}
	static int[] arr2ToArr1(int arr[][]) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		int array[] = new int[arr.length * arr[0].length];

		for (int i = 0; i < arr.length; i++) {				// 0 1 2
			for (int j = 0; j < arr[i].length; j++) {		// 0 1 2 3
				array[arr[0].length * i + j] = arr[i][j];
			}
		}
		return array;	

	}
}

		
