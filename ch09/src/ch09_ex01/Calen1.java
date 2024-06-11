package ch09_ex01;
// Calendar클래스를 이용해서 날짜시간정보를 가져오는 예제

import java.util.Calendar;
import java.util.Date;

public class Calen1 {

	public static void main(String[] args) {
// 														Calendar  class의 정적메소드
		Calendar cal = Calendar.getInstance();
//										  get()메소드.Calendar클래스의 상수
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0월부터 시작
		int date = cal.get(Calendar.DATE);

		System.out.printf("오늘은 %d 년 %d월 %d일 입니다", year, month, date);

		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.printf("지금은 %d:%d:%d시 입니다\n", hour, min, sec);
//								시간포함날짜
		Date dt = cal.getTime();
		System.out.println("cal.getTime->" + dt);

//															현재 월의 날짜 = 일
		int dy1 = cal.get(Calendar.DAY_OF_MONTH);
//															현재  년도의 날짜 = 365 - 오늘까지 일
		int dy2 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dy1 + " , " + dy2);
	}

}

// console
// 오늘은 2024 년 6월 3일 입니다지금은 1:49:2시 입니다
// cal.getTime->Mon Jun 03 13:49:02 KST 2024
// 3 , 155
