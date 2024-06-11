package ch09_ex01;
// SimpleDateFormat 클래스를 이용해서 원하는 형식으로 시간 정보 가져오는 예제

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("today->" + today);
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8;
		SimpleDateFormat sdf9;

//		년도 : yyyy/ yy 월 : MM 일:dd 요일:E 시간: H/h 분 :m 초:SS/ss/SSS 오전오후:a
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH: mm:ss. SSS");
		sdf4 = new SimpleDateFormat("yyyy-mm-dd hh: mm:SS a");
//		위 : 필수암기  밑 : 구글링 
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다");

		System.out.println("sdf1 -> " + sdf1.format(today));
		System.out.println("sdf2 -> " + sdf2.format(today));
		System.out.println("sdf3 -> " + sdf3.format(today));
		System.out.println("sdf4 -> " + sdf4.format(today));
		System.out.println();
		System.out.println("sdf5-> " + sdf5.format(today));
		System.out.println("sdf6 -> " + sdf6.format(today));
		System.out.println("sdf7 -> " + sdf7.format(today));
		System.out.println("sdf8 -> " + sdf8.format(today));
		System.out.println("sdf9 -> " + sdf9.format(today));

	}

}

// console
// today->Mon Jun 03 12:25:37 KST 2024
// sdf1 -> 2024-06-03
// sdf2 -> '24년 06월 03일 월요일
// sdf3 -> 2024-06-03 12: 25:37. 128
// sdf4 -> 2024-25-03 12: 25:128 오후
//
// sdf5-> 오늘은 올 해의 155번째 날입니다.
// sdf6 -> 오늘은 이 달의 3번째 날입니다.
// sdf7 -> 오늘은 올 해의 23번째 주입니다.
// sdf8 -> 오늘은 이 달의 2번째 주입니다.
// sdf9 -> 오늘은 이 달의 1번째 월요일입니다