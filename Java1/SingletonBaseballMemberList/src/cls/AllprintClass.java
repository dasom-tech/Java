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
				System.out.print("íŽė:");
			}else {
				System.out.print("íė:");
			}
			System.out.println(h.toString());
		}		
	}

}
