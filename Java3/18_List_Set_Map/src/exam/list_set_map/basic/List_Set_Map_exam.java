package exam.list_set_map.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.security.auth.kerberos.KerberosKey;

public class List_Set_Map_exam {

	public static void main(String[] args) {
		System.out.println("========= List ==========");
		/* (실습) List 사용실습
		1. 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		2. 전체 데이터 출력
			출력 예) index : 이름(데이터)
		3. 데이터 수정 : 홍길동 -> 홍길동2
		4. 바뀐 데이터(홍길동2) 화면 출력
		***********************************/
		
		
		System.out.println("========= Set ==========");
		/* (실습) Set 사용
		1. 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		2. 출력 : 이름 (오름차순, 가나다순)
		3. 데이터 수정 : 홍길동 -> 홍길동2
		*******************************/
		
		
		System.out.println("========= Map ==========");
		/* Map 사용
		1. 데이터 입력 : 101-홍길동, 102-강감찬, 103-박나래, 104-이순신
		2. 출력 : 101-홍길동 (key 오름차순)
		3. 수정 : 홍길동 -> 홍길동2 (key 값 사용 : 101)
		4. 수정 : 강감찬 -> 강감찬2 (이름을 비교해서 찾아서 수정)
		*********************************/
		TreeMap<Integer, String> map = new TreeMap();
		map.put(101, "홍길동");
		map.put(102, "강감찬");
		map.put(103, "박나래");
		map.put(104, "이순신");
		
		System.out.println("데이터: " + map);
		
		map.replace(101, "홍길동2");
		System.out.println("홍길동 수정후 : " + map);
				
		for (Integer key : map.keySet()) {
			if("강감찬".equals(map.get(key))) { // 모든 value 값들을 비교해서, 강감찬이랑 같으면, 강감찬2로 변경!
				map.put(key, "강감찬2");
			}
		}
		// print
		System.out.println("---------------------------");
		for (Integer key : map.keySet()) {
			System.out.println("수정후 데이터: " + key + "-" + map.get(key));
		}
		
	}
}