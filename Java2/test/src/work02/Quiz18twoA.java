package work02;

public class Quiz18twoA {

	public static void main(String[] args) {
		
		/*
		 
		 **
		 ****
		 ****
		 ***
		 *
		 ******
		 규칙 없는 모양 나오도록 작성해라
		 
		 */
		
		int array[] = {2,5,3,1,6,5};
		
		for(int i =0; i < array.length; i++) {
			for(int j = 0; j < array[i]; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
