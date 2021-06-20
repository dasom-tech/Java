/* ***********************
	1. 3명의 학생데이터(성명,국어,영어,수학)를 
	   StudentVO 클래스를 이용해서 만들고(저장하고)
	   2020111, "홍길동", 100, 90, 81
	   2020222, "이순신", 95, 88, 92
	   2020333, "김유신", 90, 87, 77
	2. List 타입의 변수(list)에 저장하고
	3. list에 있는 데이타를 사용해서 화면출력
	     성명     국어   영어  수학    총점     평균
	   --------------------------
	     홍길동  100  90  81  270  90.33
	   ...
	4. list에서 아이디(2020333) 수학점수를 80 점으로 수정하고
	   전체 데이터 다시 화면 출력   
	**************************/
package exam.list_set_map.sungjuk;

import java.util.ArrayList;
import java.util.List;

public class StudentVO_List_Exam {

	public static void main(String[] args) {
		
		StudentVO stu_data1 = new StudentVO("2020111","홍길동",100,90,81);
		StudentVO stu_data2 = new StudentVO("2020222","이순신",95,88,92);
		StudentVO stu_data3 = new StudentVO("2020333","김유신",90,87,77);
		
		List<StudentVO> list = new ArrayList<>();

		list.add(stu_data1);
		list.add(stu_data2);
		list.add(stu_data3);
	
		System.out.println("성명     국어   영어  수학    총점     평균");
		System.out.println("-----------------------------");
		// for문 사용법 
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// foreach 사용법
		for (StudentVO student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		
		/*
		//1. 2020333이 들어있는 객체의 인덱스를 리스트에서 찾기
		int findIndex = list.indexOf(stu_data3);
		
		//2. 찾은 인덱스에 있는 객체 가져오기
		StudentVO findResult = list.get(findIndex);
		
		//3. 해당 객체의 수학점수 변경하기
		findResult.setMath(80);
		*/
		
		// 2020333이 어디있는지 직접 list에서 찾아서 수정하기.
		// 2020333으로 찾는 건 for 루프를 돌리는 수밖에 없음!
		for (StudentVO student : list) {
			if ("2020333".equals(student.getId())) {
				student.setMath(80);
				break;
			}
		} // 끝
		
		System.out.println("===========데이터 수정후===========");
		System.out.println("성명     국어   영어  수학    총점     평균");
		System.out.println("-----------------------------");
		for (StudentVO student : list) {
			System.out.println(student);
		} 		
	}
}
/*강사님 풀이
StudentVO svo1 = new StudentVO("2020111", "홍길동", 100, 90, 81);
StudentVO svo2 = new StudentVO("2020222", "이순신", 95, 88, 92);
StudentVO svo3 = new StudentVO("2020333", "김유신", 90, 87, 77);

List<StudentVO> list = new ArrayList<>();
list.add(svo1);
list.add(svo2);
list.add(svo3);
System.out.println("list : " + list);

//화면출력
System.out.println("아이디\t성명\t국어\t영어\t수학\t총점\t평균");
System.out.println("-------------------------------------------");
for (StudentVO svo : list) {
	String id = svo.getId();
	String name = svo.getName();
	int kor = svo.getKor();
	System.out.println(id +"\t" + name + "\t" + kor);

	System.out.println(svo.getId() +"\t" + svo.getName() + "\t" + svo.getKor());
}
System.out.println("-------------");
for (StudentVO svo : list) {
	svo.displayData();
}

//----------------------
System.out.println("=============");
//list에서 아이디(2020333) 수학점수를 80 점으로 수정
String id = new String("2020333");
for (StudentVO svo : list) {
	if (svo.getId().equals(id)) {
		System.out.println("id 2020333 이름 : " + svo.getName());
		svo.setMath(80);
	}
}
svo1.setKor(88);
for (StudentVO svo : list) {
	svo.displayData();
}
if (svo1 == list.get(0)) {
	System.out.println("svo1과 list.get(0) 같은 객체(인스턴스)");
} else {
	System.out.println("svo1과 list.get(0) 다른 객체(인스턴스)");
}

System.out.println(">> main() 끝");
}
}
*/