package dto;

import single.SingletonClass;

public class Pitcher extends Human {

	private int win;
	private int lose;
	private double defence; 
	
	public Pitcher() {
		SingletonClass si = SingletonClass.getInstance(); // 싱글톤 클래스 생성
	}

	

	public Pitcher(int number, String name, int age, double height, int win, int lose, double defence) {
		super(number, name, age, height);
		this.win = win;
		this.lose = lose;
		this.defence = defence;
	}



	public int getWin() {
		return win;
	}

	public int getLose() {
		return lose;
	}

	public double getDefence() {
		return defence;
	}

	@Override
	public String toString() {
		//return "Pitcher [Number=" + getNumber() + ", Name=" + getName() + ", Age=" + getAge() +	", Height=" + getHeight() + ", win=" + win + ", lose=" + lose + ", defence=" + defence + "]";
		return super.toString() + win + "-" + lose + "-" + defence;
	}

	public void setWin(int win2) {
		// TODO Auto-generated method stub
		
	}

	public void setLose(int lose2) {
		// TODO Auto-generated method stub
		
	}

	public void setDefence(double defence2) {
		// TODO Auto-generated method stub
		
	}
}