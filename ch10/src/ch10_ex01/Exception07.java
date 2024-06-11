package ch10_ex01;

public class Exception07 { // 클래스가 존재하지 않으면 던지겠다
	static void callDriver() throws ClassNotFoundException {
		System.out.println("callDriver 수행중"); //2. 출력
//		클래스를 메모리에 올려줄때 사용 -> 드라이버가 없다면 오류를 발생시킨다.
//		현재 드라이버가 없기때문에 밑에 내용은 출력되지 않는다
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("callDriver 완료");

	}

	public static void main(String[] args) {
		System.out.println("callDriver 호출전");	// 1. 출력
		try {
			callDriver();
			// 에러를 포함한 객체기때문에 예외처리 
		} catch (ClassNotFoundException e) {
			System.out.println("class를 찾을 수 없습니다."); // 3.출력
		} catch (Exception e) {
			System.out.println("e.getMessage"+e.getMessage());
		
		} finally {
			System.out.println("시스템 종료"); // 4.출력
		}

	}
}