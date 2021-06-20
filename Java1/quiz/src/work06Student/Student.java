package work06Student;

public class Student {
	
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int math;
	public int eng;
	public int getTotal;
	public double getAverage;
	
	public int getTotal(int kor, int eng, int math) {
		getTotal = kor + eng + math;
		return getTotal;
	}
	
	public double getAverage() {
		getAverage = (double)getTotal / 3;
		return getAverage;
	}
	

}
