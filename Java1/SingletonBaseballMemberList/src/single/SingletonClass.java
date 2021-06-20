package single;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class SingletonClass {
	private static SingletonClass si = null;
	public List<Human> list = null;

	private SingletonClass() {	
		list = new ArrayList<Human>();
	}
	
	public static SingletonClass getInstance() {
		if(si == null) {
			si = new SingletonClass();
		}
		return si;
	}

}
