package dto;

import single.SingletonClass;

public class Batter extends Human {
	private int batcount;	// 타수
	private int hit;		// 안타수	
	private double hitAvg;	// 타율
	
	public Batter() {
		SingletonClass si = SingletonClass.getInstance(); // 싱글톤 클래스 생성
	}
	

	public Batter(int number, String name, int age, double height, int batcount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}


	public int getBatcount() {
		return batcount;
	}

	public int getHit() {
		return hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}
	
	@Override
	public String toString() {
//		return "Batter [Number=" + getNumber() + ", Name=" + getName() + ", Age=" + getAge() + ", "
//				+ "Height=" + getHeight() + ", batcount=" + batcount + ", hit=" + hit + ", hitAvg=" + hitAvg + "]";
		return super.toString() + batcount + "-" + hit + "-" + hitAvg;
	}
		
}