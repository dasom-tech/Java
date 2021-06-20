package he;

import single.SingletonClassggg;

public class HeClass {
	private int num;
	
	public HeClass() {
	}
	
	public void method() {
		SingletonClass si = SingletonClass.getInstance();
		num = si.ynum;
	}

	@Override
	public String toString() {
		return "HeClass [num=" + num + "]";
	}
}
