package work08Two;

public class Point3D {
	int x, y, z;
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	Point3D() {
		this(0, 0, 0);
	}
	
	public boolean equals(Object obj) {
		
		Point3D pos = (Point3D)obj;
		if(this.x == pos.x && this.y == pos.y && this.z == pos.z) {
			return true;
		}
		return false;
		
		
	}
	@Override
	public String toString() {
		
		return "[" + x + "," +  y + "," + z + "]";
	}
	
	

}
