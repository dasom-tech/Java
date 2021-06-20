package cls;

import java.util.List;

import dto.Human;
import single.SingletonClass;

public class AllprintClass {
	
	
	private List<Human> list;
	Human h;
	
	public void allprint() {
		SingletonClass si = SingletonClass.getInstance();
		list = si.list;
		
		for (int i = 0; i < list.size(); i++) {
			h = list.get(i);
			if(h.getNumber() < 2000) {
				System.out.print("투수:");
			}else {
				System.out.print("타자:");
			}
			System.out.println(h.toString());
		}		
	}

}
