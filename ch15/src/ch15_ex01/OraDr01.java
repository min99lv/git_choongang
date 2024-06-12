package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDr01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver"; // 약속 , 예약어
//								예약어 + @ip주소		개발 DB :개발포트번호:서비스아이디
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		System.out.println("start1"); // 오류 시점 찾기
		try {
//			Oracle Driver Memory Up 사용
			Class.forName(driver);
			System.out.println("start2"); // 오류 시점 확인
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("start3"); // 오류시점 확인
			if (conn != null) { // 연결 실패가 아닐시 if 문 실행
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
