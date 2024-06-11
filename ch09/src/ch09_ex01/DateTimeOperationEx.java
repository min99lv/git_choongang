package ch09_ex01;
// 날짜 시간 연산 예제
import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시:"+now);
		LocalDateTime targetDatetime = now.plusYears(1)
																				.minusMonths(2)
																				.plusDays(3)
																				.plusHours(4)
																				.minusMinutes(5)
																				.plusSeconds(5)
																				;
																					
//		연산 후
		System.out.println("연산 후 :"+targetDatetime);
		
		

	}

}

// console
// 현재시:2024-06-03T14:05:12.557975100
// 연산 후 :2025-04-06T18:00:17.557975100