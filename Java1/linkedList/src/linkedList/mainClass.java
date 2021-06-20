package linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	ArrayList : 검색, 대입		== vector(Standard Template Library)
		 	
		 	LinkedList : 실시간 추가, 삭제가 빠르다		 
		 */
		Vector<String> vec = new Vector<String>();
		
		vec.add(new String("hello"));
		vec.add(0, "world");
		vec.size();
		
		System.out.println(vec.toString());
		System.out.println(vec.size());
		
		LinkedList<String> list = new LinkedList<String>(); // 이렇게 써도 되는데 호환이 안 될 수도 있음.
		//List<String> list = new LinkedList<String>();
		list.add("Tigers");
		list.add("Giants");
		list.add("Twins");
		
		for (String s : list) {
			System.out.println("1." + s);
		}
		
		//맨 앞에 element(요소)를 추가
		list.addFirst("Lions");
		
		for (String s : list) {
			System.out.println("2." + s);
		}
		
		list.addLast("Bears");
		
		for (String s : list) {
			System.out.println("3." + s);
		}
		
//		ArrayList<String> alist = new ArrayList<String>(list); //arraylist로 넘겨줌
//		LinkedList<String> llist = new LinkedList<String>(alist); // 다시  linkedlist로 넘겨줌
		
		// Iterator : 반복자 == 포인터	0x10 -> 0x14	속도 빠름. 보완에 취약-주소만 알면 다 끄집어낼 수 있음.
		// 							[0]		[1]
		// 컬렉션에 저장된 데이터의 위치 정보를 포함한 커서가 있어서 인덱스 등을 사용하지 않고도 쉽게 데이터에 접근.
		// 컬렉션에 저장된 모든 데이터를 순차적으로 접근하여 사용할 목적.
		
		Iterator<String> it;
		it = list.iterator();
		
		while(it.hasNext()) {	// hasNext()는 현재 커서 다음에 데이터가 존재하는지 판단.
			String value = it.next();// Next()는 커서 다음의 데이터를 반환하고 커서를 다음 데이터로 이동시킴.
			System.out.println("it: " + value);
		}
		
		
		
		
	}

}
