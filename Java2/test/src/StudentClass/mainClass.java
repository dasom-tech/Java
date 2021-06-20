package StudentClass;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		     //성적 관리 프로그램
		  
		     String student[][] = null; 
		    /*		 = {
		    		 {"홍길동", "90","100","85"}
		    		 {"홍길동", "90","100","85"}
		    		 {"홍길동", "90","100","85"}
		     };*/
		     int sum;
		     double avg;
		     int max, min;
		     
		     // 초기화
		     sum = 0;
		     
		 // 1. 몇 명의 학생의 통계?
		     
		  System.out.println("학생의 수를 입력하시오 = ");
		  int count = sc.nextInt();
		  
		  student = new String[count][4] ;
		  
		  //2. 이름 / 국어 / 수학 / 영어 점수 입력받기(잘 못 입력시 다시 입력)		CRUD(Create, Read, Update, Delete)
		  /*
		  for (int i = 0; i < student.length; i++) {
			System.out.print("이름 = ");
			student[i][0] = sc.next();
			
			System.out.print("국어 = ");
			student[i][1] = sc.next();
			
			System.out.print("수학 = ");
			student[i][2] = sc.next();
			
			System.out.print("영어 = ");
			student[i][3] = sc.next();
		}*/
		  
		  int w = 0;
		  while(w < student.length) {
			  
			  System.out.println((w + 1) + "번째 학생의 정보>>>");
			  
			  System.out.print("이름 = ");
				String name = sc.next();
				
				System.out.print("국어 = ");
				String kor = sc.next();
				
				System.out.print("수학 = ");
				String math = sc.next();
				
				System.out.print("영어 = ");
				String eng = sc.next();
				
				if(name.trim().equals("")) {
					System.out.println("이름을 입력해주세요 = ");
					continue;
				}
				
				// 국어 체크
				boolean nogood = false;
				for (int i = 0; i < kor.length(); i++) {
					int asc = (int)kor.charAt(i);
					if(asc < 48 || asc > 57) {
						nogood = true;
						break;
					}
				}
				if(nogood == true) {
					System.out.println("국어 점수에 오류가 있습니다. ");
					continue;
				}
				
				// 수학 체크
				nogood = false;
				for (int i = 0; i < math.length(); i++) {
					int asc = (int)math.charAt(i);
					if(asc < 48 || asc > 57) {
						nogood = true;
						break;
					}
				}
				if(nogood == true) {
					System.out.println("수학 점수에 오류가 있습니다. ");
					continue;
				}
				
				// 영어 체크
				nogood = false;
				for (int i = 0; i < eng.length(); i++) {
					int asc = (int)eng.charAt(i);
					if(asc < 48 || asc > 57) {
						nogood = true;
						break;
					}
				}
				if(nogood == true) {
					System.out.println("영어 점수에 오류가 있습니다. ");
					continue;
				}
				
				// 정상적으로 입력한 경우
				student[w][0] = name;
				student[w][1] = kor;
				student[w][2] = math;
				student[w][3] = eng;
				
				w++;
			  }
			for (int i = 0; i < student.length; i++) {
			  System.out.println(Arrays.toString(student[i]));
			}
				  
		  
		  //3. 각 학생들의 총점
			int st_sum[] = new int[student.length];
			for (int i = 0; i < student.length; i++) {
				int kor = Integer.parseInt(student[i][1]);
				int math = Integer.parseInt(student[i][2]);
				int eng = Integer.parseInt(student[i][3]);
				st_sum[i] = kor + math + eng;
			}
			
			for (int i = 0; i < st_sum.length; i++) {
				System.out.print(student[i][0] + "의 총점:");
				System.out.println(st_sum[i]);
			}

		  //4. 총점의 1등?
			
			max = 0;
			for (int i = 0; i < st_sum.length; i++) {
				if(max < st_sum[i]) {
					max += st_sum[i];
				}
			}
			System.out.println("총점의 최고점: " + max) ;
	
		  //5. 과목의 1등?
			int kor_score[] = new int[student.length];
			for (int i = 0; i < kor_score.length; i++) {
				kor_score[i] = Integer.parseInt(student[i][1]);
			}
			max = kor_score[0];
			for (int i = 0; i < kor_score.length; i++) {
				if(max < kor_score[i]) {
					max += kor_score[i];
				}
			}
			System.out.println("국어의 최고 점수: " + max);
			
			int math_score[] = new int[student.length];
			for (int i = 0; i < math_score.length; i++) {
				math_score[i] = Integer.parseInt(student[i][2]);
			}
			max = math_score[0];
			for (int i = 0; i < math_score.length; i++) {
				if(max < math_score[i]) {
					max += math_score[i];
				}
			}
			System.out.println("수학의 최고 점수: " + max);
			
			int eng_score[] = new int[student.length];
			for (int i = 0; i < eng_score.length; i++) {
				eng_score[i] = Integer.parseInt(student[i][3]);
			}
			max = eng_score[0];
			for (int i = 0; i < eng_score.length; i++) {
				if(max < eng_score[i]) {
					max += eng_score[i];
				}
			}
			System.out.println("영어의 최고 점수: " + max);
			
		  //6. 과목의 꼴등?
			int kor_score1[] = new int[student.length];
			for (int i = 0; i < kor_score1.length; i++) {
				kor_score1[i] = Integer.parseInt( student[i][1] );			
			}
			min = kor_score1[0];
			for (int i = 0; i < kor_score1.length; i++) {
				if(min > kor_score1[i]) {
					min = kor_score1[i];
				}
			}
			System.out.println("국어의 최저점수:" + min);
			
			int math_score1[] = new int[student.length];
			for (int i = 0; i < math_score1.length; i++) {
				math_score1[i] = Integer.parseInt( student[i][2] );			
			}
			min = math_score1[0];
			for (int i = 0; i < math_score1.length; i++) {
				if(min > math_score1[i]) {
					min = math_score1[i];
				}
			}
			System.out.println("수학의 최저점수:" + min);
			
			int eng_score1[] = new int[student.length];
			for (int i = 0; i < eng_score1.length; i++) {
				eng_score1[i] = Integer.parseInt( student[i][3] );			
			}
			min = eng_score1[0];
			for (int i = 0; i < eng_score1.length; i++) {
				if(min > eng_score1[i]) {
					min = eng_score1[i];
				}
			}
			System.out.println("영어의 최저점수:" + min);
			
		  //7. 총점의 평균
			for (int i = 0; i < st_sum.length; i++) {
				sum += st_sum[i];
			}
			avg = (double)sum / student.length;
			System.out.println("총점의 합계 : " + sum);
			System.out.println("총점의 평균 : " + avg);
			
		  //8. 이름을 입력하면, 그 학생의 성적 출력
			System.out.print("검색할 학생의 이름= ");
			String name = sc.next();
			
			int findIndex = -1;
			for (int i = 0; i < student.length; i++) {
				if(name.equals(student[i][0])) {     //찾았을 때
					findIndex = i;
					break;
				}
			}
			
			if(findIndex != -1) {
				System.out.println(Arrays.toString(student[findIndex]));
			}else {
				System.out.println("학생 명단에 없습니다.");
			}

	}

}
