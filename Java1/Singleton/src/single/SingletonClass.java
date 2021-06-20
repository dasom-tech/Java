package single;

public class SingletonClass {
	
	//public static int staticNumber;
	
	private static SingletonClass si = null;
	
	public int number;
	public int ynum;
	
	private SingletonClass() {	
	}
	
	public static SingletonClass getInstance() {
		if(si == null) {
			si = new SingletonClass();
		}
		return si;
	}

}
