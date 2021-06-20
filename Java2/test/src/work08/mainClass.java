package work08;

public class mainClass {

	/*	
		 	두 점과 점 사이 거리 구하는 공식
		 	(x1, y1) (x2, y2)

		 	(y2 - y1)제곱 + (x2 - x1)제곱
		 	루트 함수: Math.sqrt
		 	승수 함수: Math.pow

	 */


	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다. 
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));  

	}
	static double getDistance(int x, int y, int x1, int y1) {
		double value;

		value = Math.pow(y1 - y, 2) + Math.pow(x1 - x, 2);
		value = Math.sqrt(value);

		return value;	
	} 
}



