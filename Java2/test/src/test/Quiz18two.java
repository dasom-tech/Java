package test;

public class Quiz18two {

	public static void main(String[] args) {
		
		int n = 0;
				
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				n++;
			}else {
				n--;
			}
			
			for(int j = 0; j < n; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
