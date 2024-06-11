package ch09_ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
// = import java.time.*;

public class DateTimeCreateEx {

	public static void main(String[] args) {
//		날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜:" + currDate);
		LocalDate targerDate = LocalDate.of(2024, 11, 18);
		System.out.println("목표 날짜:" + targerDate + "\n");
//		시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간:"+currTime);
		LocalTime targetTime = LocalTime.of(6, 30, 10, 0);
		System.out.println("목표 시간:"+targetTime+"\n");
//		날짜의 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간"+currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 11, 18, 17, 50, 0, 0);
		System.out.println("목표 날짜와 시간 :"+targetDateTime+"\n");
		
//		 협정 세계시와 시간존(TimeZone) => 구글링...
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");;
		

	}

}
