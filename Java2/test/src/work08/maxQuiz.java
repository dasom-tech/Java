package work08;

public class maxQuiz {
	
	static int max (int data[]) {
		if(data == null || data.length == 0) {
			return -999999;
		}
		
		int m = data[0];
		for (int i = 0; i < data.length; i++) {
			if(m < data[i]) {
				m = data[i];
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		//int[] data = null;
		System.out.println(java.util.Arrays.toString(data)); 
		System.out.println("최대값:" + max(data));   
	}
	
}
			
