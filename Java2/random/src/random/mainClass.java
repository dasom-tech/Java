package random;

public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		   
		   random :  난수, 무작위 <--> pattern
		  
		 */
		
		int randNum;
		
		randNum = (int)(Math.random() * 10);    // 0 ~ 9사이 숫자가 랜덤으로 뽑힘.
		System.out.println("randNum = " + randNum);
		
		// 10 ~ 19
		randNum = (int)(Math.random() * 10) + 10;
		System.out.println("randNum = " + randNum);
		
		// 10 20 30 40 50
		randNum = ((int)(Math.random() * 5) + 1) * 10;
				                      //0 ~ 4->1 ~ 5
		System.out.println("randNum = " + randNum);
		
		// -1 0 1
		randNum = (int)(Math.random() *3) - 1;
		//                           //0 ~2->-1 ~ 1     
		System.out.println("randNum = " + randNum);
		
		// 11 23 14 56 78
		int rArrNum[] = {11, 23, 14, 56, 78};
		randNum = (int)(Math.random() *5);
		//                           //0 ~ 4
		System.out.println(rArrNum[randNum]);
		
		
		
		
		
	}

}
