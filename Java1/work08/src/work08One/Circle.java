package work08One;

public class Circle extends Shape {
	
	double r;
	
	public Circle() {	
	}
	public Circle(double r) {
		this.r =r;
	}
	
	@Override
	public double calcArea() {
		
		double s = r * r * Math.PI;		
		return s;
	}

}
