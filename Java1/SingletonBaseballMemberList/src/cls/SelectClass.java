package cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Human;
import single.SingletonClass;

public class SelectClass {
	Scanner sc = new Scanner(System.in);
	private List<Human> list = null;	
	
	SingletonClass si = SingletonClass.getInstance();
	
	public void select() {	
		list = si.list;
		System.out.print("검색하고 싶은 선수 명 = ");
		String name = sc.next();
		
		List<Integer> indexList = searchAll(name);
		
		if(indexList.size() == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		for (int i = 0; i < indexList.size(); i++) {
			Human h = list.get( indexList.get(i) );
			System.out.println(h.toString());
		}		
	}
	
	private List<Integer> searchAll(String name) {		
		List<Integer> indexList = new ArrayList<Integer>();		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				indexList.add( i );
			}			
		}		
		return indexList;
	}


}
