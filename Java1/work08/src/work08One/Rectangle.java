package work08One;

public class Rectangle extends Shape {
	
	int width;
	int height;
	
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width * height;
	}
	
	public boolean isSquare() {
		if(width == height) {
			return true;
		}
		return false;
		
	}

}
