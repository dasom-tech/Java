
public class mainClass {
	public static void main(String[] args) {
		int numberOne[] = {1,2,3,4,5};
		int numberTwo[] = {11,22,33,44,55};
		
		int oneNum[] = numberOne;
		int twoNum[] = numberTwo;
		
		// swap
		/* 비효율적
		int temp;
		for (int i = 0; i < numberOne.length; i++) {
				temp = numberOne[i];
				numberOne[i] = numberTwo[i];
				numberTwo[i] = temp;
			
		}
		*/
		int temp[];
		temp = oneNum;
		oneNum = twoNum;
		twoNum = temp;
		
		for (int i = 0; i < numberOne.length; i++) {
			System.out.print(numberOne[i] + " ");
		}
		
		for (int i = 0; i < oneNum.length; i++) {
			System.out.print(oneNum[i] + " ");
		}
		
		
	}

}
