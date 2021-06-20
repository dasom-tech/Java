package main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class mainClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		/*
		 	Calendar year month day
		 	Date					time
		
		 */
		
		//Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		
		// 날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	//0 ~ 11로 되어있음.
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
		// 날짜를 설정
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 4 - 1);		// 4월
		cal.set(Calendar.DATE, 13);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
		// 요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7 일 ~ 토
		
		switch(weekday) {
			case 1:
				System.out.println("일요일입니다");
				break;
			case 2:
				System.out.println("월요일입니다");
				break;
			case 3:
				System.out.println("화요일입니다");
				break;
			case 4:
				System.out.println("수요일입니다");
				break;
			case 5:
				System.out.println("목요일입니다");
				break;
			case 6:
				System.out.println("금요일입니다");
				break;
			case 7:
				System.out.println("토요일입니다");
				break;
		}
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11 - 1);
		
		// 지정한 달의 마지막 날짜 
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday: " + lastday);
		
		// 달력 출력
		cal.set(Calendar.DATE, 1);	// 1일
		
		// 위쪽의 빈 칸
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int upspace = (weekday - 1) % 7;
		
		System.out.println("위쪽 빈칸 수: " + upspace);
		
		// 그 달의 마지막 날짜
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday: " + lastday);
		
		// 밑의 빈 칸
		cal.set(Calendar.DATE, lastday);		// 마지막 날로 셋팅
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		int downspace = 7 - weekday;
		System.out.println("아래쪽 빈칸 수: " + downspace);
		
		// 달력 출력
		year = 2021;
		month = 1;
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month -1);
		cal.set(Calendar.DATE, 1);
		
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int date = 1;
		
		System.out.println(year + "년" + month + "월");
		System.out.println("==================================================");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		System.out.println("==================================================");
		
		// 위쪽 빈 칸
		for (int i = 1; i < startDay; i++) {	//startDay == 금요일이니까 6
			System.out.print("*" + "\t");
		}
		
		// 날짜
		for (int i = 0; i < lastDay; i++) {
			System.out.print(date + "\t");
			
			// 개행
			if((date + startDay -1) %7 == 0) {
				System.out.println();
			}
			
			date++;
		}
		
		// 아래쪽 빈 칸
		for (int i = 0; i < (7 - (startDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		
		System.out.println("==================================================");
	}
	
}
			

















