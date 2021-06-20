package work08One;

public class mainClass {
	public static void main(String[] args) {
		
		Shape s = new Circle(3.0);
		System.out.println(s.calcArea());
		
		Shape rect = new Rectangle(23, 34);
		System.out.println(rect.calcArea());
		System.out.println("정사각형: " + ((Rectangle)rect).isSquare());
		
		// 위와 같은 결과
		Point p = new Point(10, 12);
		Shape base = new Shape(p) {
		
			@Override
			public double calcArea() {
				return (p.getX() * p.getY()) / 2;
			}
			
		};
		
		System.out.println(base.calcArea());
		
	}

}
