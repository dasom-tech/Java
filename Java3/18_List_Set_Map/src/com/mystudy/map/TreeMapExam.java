package com.mystudy.map;

import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TreeMap : 키(key) 값 기준으로 오름차순 정렬해서 저장
		// ctrl+shift+o :일괄 import 처리
		TreeMap<String, Integer> map = new TreeMap<>(); 
		map.put("홍길동", 100);
		map.put("김유신", 100);
		map.put("강감찬", 88);
		map.put("100", 93);
		map.put("20", 93);
		map.put("10", 93);
		map.put("a", 93);
		map.put("A", 93);
		map.put("*", 93);
		map.put("%", 93);
		map.put("_", 93);
		map.put("-", 93);
		map.put("@", 93);
		
		System.out.println(map);
		
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}