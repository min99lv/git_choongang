package ch05_ex02;

import java.util.Calendar;		//		캘린더 내장객체

public class EnumWeekEx {		// 열거상수를 이용해서 캘린더를 불러와 오늘의 요일을 알려주는 예제

	public static void main(String[] args) {
				Week today = null;			// today는 Week열거상수변수선언
				
				Calendar cal = Calendar.getInstance();							// 캘린더 객체로 현재시간 정보가 나온다
				int weekNum = cal.get(Calendar.DAY_OF_WEEK) ; 	// weekNum이란 변수를 선언
																														// 현재시간에서 요일의 정보를 가져온다
				
				switch(weekNum)	{					
						case 1:
								today = Week.SUNDAY; break;
						case 2:
								today = Week.MONDAY; break;
						case 3:
								today = Week.TUESDAY; break;
						case 4:
								today = Week.WEDNEDAY; break;
						case 5:
								today = Week.THURSDAY; break;
						case 6:
								today = Week.FRIDAY; break;
						case 7:
								today = Week.SATURDAY; break;
				}
				
				System.out.println("오늘 요일"+today);
				
				if (today == Week.SUNDAY)		{
						System.out.println("일요일에는 축구를 합니다.");
				}	else		{
						System.out.println("열심히 자바 공부합니다");
				}
	}

}

// 열거상수 선언 -> 열거상수변수선언 -> 캘린더 내장객체 선언 -> Calendar.getInstance();를 
//  이용해서 현재시간정보를 가져온다 -> 오늘의 요일을 알려줄 변수를 선언한다 -> cal.get(Calendar.DAY_OF_WEEK)
//  를 이용해서 오늘의 요일정보를 가져온다 -> switch문을 이용해서 today열거상수변수에 저장해준다 -> 출력
