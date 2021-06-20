package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	HashMap: 사전
		 			  String : Object
		 				"사과":"apple"
		 				 key : value	-> 1 pair ==> web json
		 				 tree구조
		 				 key는 중복되지 않는다.
		 				 
		 	TreeMap: HashMap + Sorting
		 */
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<Integer, String>(); //인터페이스
		//TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hMap); //hashMap에 비해 무겁다
		
		//추가	 key   value
		hMap.put(111, "백십일");
		hMap.put(new Integer(222), new String("이백이십이"));
		hMap.put(333, "삼백삼십삼");
		
		//value 취득
		String value = hMap.get(111);
		System.out.println("value: " + value);
		
		//검색
		//있다/없다
		boolean b = hMap.containsKey(new Integer(222));
		System.out.println("b = " + b);
		
		//값을 취득
		if(hMap.containsKey(333)) {
			value = hMap.get(333);
			System.out.println("value: " + value);
		}
		
		//모든 key값을 취득 -> value
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key: " + key);
			
			String val = hMap.get(key);
			System.out.println("val: " + val);
		}
		
		//수정(value만 가능, key값 변경 원할시 지웠다가 다시 작성해야 함)
		hMap.replace(111, "100+10+1");
		hMap.put(111, "110 + 1"); // -> 기존에 값이 있다면 새로운 값으로 대체됨. 수정과 동일한 효과
		
		//삭제
		hMap.remove(222);
		
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key: " + key);
			
			String val = hMap.get(key);
			System.out.println("val: " + val);
		}
		
		HashMap<String, String> haMap = new HashMap<String, String>();
		
		haMap.put("apple", "사과");
		haMap.put("pear", "배");
		haMap.put("grape", "포도");
		haMap.put("banana", "바나나");
		
		//취득
		value = haMap.get("apple");
		System.out.println("value: " + value);
		
		//sorting
		//TreeMap <--->HashMap
		TreeMap<String, String> treeMap = new TreeMap<>(haMap);
		
		//오름차순
		//Iterator<String> itKey = treeMap.keySet().iterator();
		
		//내림차순
		Iterator<String> itKey = treeMap.descendingKeySet().iterator();
		
		System.out.println("-----------------------------");
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println("key: " + key + "value: " + treeMap.get(key));
		}
		
		HashMap<Integer, MyDto> myMap = new HashMap<Integer, MyDto>();
		
		//추가
		myMap.put(1, new MyDto(1,"홍길동"));
		myMap.put(2, new MyDto(2,"일지매"));
		myMap.put(4, new MyDto(3,"이다솜"));
		myMap.put(3, new MyDto(4,"최성학"));
		myMap.put(5, new MyDto(5,"이지선"));
		
		//삭제
		myMap.remove(2);
		
		//검색
		boolean b1 = myMap.containsKey(3);
		System.out.println("b = " + b1);
		
		if(myMap.containsKey(3)) {
			MyDto value1 = myMap.get(3);
			System.out.println("value: " + value1);
		}
		System.out.println("==================================");
		//수정
		myMap.replace(5, new MyDto(5,"성춘향"));
		
		//출력
		Iterator<Integer> it2 = myMap.keySet().iterator();
		
		while(it2.hasNext()) {
			Integer key = it2.next();
			System.out.println("key: " + key);
			
			MyDto value1 = myMap.get(key);
			System.out.println("val: " + value1);
		}

	}

}
















