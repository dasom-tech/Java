package you;

import single.SingletonClass;

public class YouClass {
	
	private int count;
	private int ynumber;
	
	public YouClass() {
		
		ynumber = 234;
		
		SingletonClass si = SingletonClass.getInstance();
		count = si.number;
		
		si.ynum = this.ynumber;
	}

//	public void setCount(int count) {
//		this.count = count;
//	}
	
	@Override
	public String toString() {
		return "YouClass [count=" + count + "]";
	}

}
