package arrayList;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import dto.MemberDto;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Collection : (Object)수집
		 	
		 	List : 목록		+ Array
		 		       데이터의 관리를 유동적으로 할 수 있는 배열
		 		       
		 	ArrayList(== Vector)
		 			배열처럼 사용할 수 있는 목록
		 			선형 구조	O-O-O-O-O-
		 			검색 속도가 빠르다.
		 			INDEX로 접근하고 관리된다.		0 ~ n-1까지
		 			
		 	LinkedList
		 			삽입과 삭제가 빈번하게 처리하는 경우에 적합
		 */
		 
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
		
		// 추가
		arrlist.add(1001);
		
		arrlist.add(new Integer(1002));
		
		Integer in = new Integer(1003);
		arrlist.add(in);
		
		// list size
		int len = arrlist.size();
		System.out.println(len);
		
		// 데이터의 산출
		Integer outVal = arrlist.get(1);
		System.out.println(outVal);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer n = arrlist.get(i);
			System.out.println(n);
		}
		
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		
		// 원하는 위치에 추가
		Integer inum = new Integer(5002);
		arrlist.add(1, inum);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer n = arrlist.get(i);
			System.out.println(i + ":" + n);
		}
		
		// 삭제
		arrlist.remove(2);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer n = arrlist.get(i);
			System.out.println(i + ":" + n);
		}
		
		// 검색
		int index = arrlist.indexOf(1003);
		System.out.println("index: " + index);
		System.out.println(arrlist.get(index));
		
		index = -1;
		for (int i = 0; i < arrlist.size(); i++) {
			Integer value = arrlist.get(i);
			if(value == 5002) {
				index = i;
				break;
			}
		}
		System.out.println("find index: " + index);
		
		// 수정
		Integer udata = new Integer(1002);
		arrlist.set(1, udata);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer n = arrlist.get(i);
			System.out.println(i + ":" + n);
		}
		
		//String으로 list 추가, 삭제, 검색, 수정해보기
		ArrayList<String> list = new ArrayList<String>();
		
		//추가
		list.add("Hello");
		list.add("Java");
		list.add("good");
		list.add("happy");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		list.add(4, "day");
		//삭제
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		//검색
		list.indexOf(1);
		System.out.println("index : " + index);
		System.out.println(list.get(index));
		
		//수정
		list.set(2, "owesome");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List<MemberDto> memlist = new ArrayList<MemberDto>();
		
		//추가
		MemberDto dto = new MemberDto(101, "홍길동", 24);
		memlist.add(dto);
		
		dto = new MemberDto(102, "성춘향", 18);
	    memlist.add(dto);
	    
	    memlist.add(new MemberDto(103, "일지매",17));
	    
	    for (int i = 0; i < memlist.size(); i++) {
			System.out.println(memlist.get(i).toString());
		}
		
		//검색
	    String name = "성춘향";
	    int findindex = -1;
	    for (int i = 0; i < memlist.size(); i++) {
			MemberDto m = memlist.get(i);
			if(name.equals(m.getName())) {
				findindex = i;
				break;
			}
		}
		MemberDto m = memlist.get(findindex);
		System.out.println(m.toString());
		
		
		//나이	18세 이상 멤버
		List<MemberDto> findlist = new ArrayList<MemberDto>();
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto mem = memlist.get(i);
			if(mem.getAge() >= 18) {
				findlist.add(mem);
				
			}
		}
		for (MemberDto mem : findlist) {
			System.out.println(mem.toString());
		}
		
		System.out.println();
		
		//수정
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		MemberDto uMem = new MemberDto(105, "정수동", 26);
		memlist.set(2, uMem);
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		MemberDto upMem = memlist.get(0);
		upMem.setName("임꺽정");
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		MemberDto dData = memlist.remove(0);
		System.out.println(dData.toString() + "가 삭제되었습니다.");
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}


	}
	
}















