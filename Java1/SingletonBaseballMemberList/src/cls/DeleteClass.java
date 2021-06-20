package cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Human;
import single.SingletonClass;

public class DeleteClass {
	Scanner sc = new Scanner(System.in);
	private List<Human> list = null;
	
	SingletonClass si = SingletonClass.getInstance();
	
	public void delete() {		
		list = si.list;
		System.out.print("삭제하고 싶은 선수의 이름 = ");
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		list.remove(index);
		System.out.println("선수 명단에서 삭제하였습니다");
	}
	
	private int search(String name) {
		int index = -1;		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}		
		return index; 
	}


}

