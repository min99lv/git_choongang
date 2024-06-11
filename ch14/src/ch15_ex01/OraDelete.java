package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraDelete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서를 입력하세요?");
		String deptno = sc.nextLine();
//		객체 초기화
		Connection conn = null;
		Statement stmt = null;
//		변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "DELETE DEPT WHERE DEPTNO =" + deptno;
//		hw02
//		삭제할 부서를 입력 코드를 이용하여 삭제
		try {
//			드라이버 메모리에 올리기
			Class.forName(driver);
//			드라이버 연결
			conn = DriverManager.getConnection(url, "scott", "tiger");
//			sql문 실행
			stmt = conn.createStatement();
//			sql문 반환
			int result = stmt.executeUpdate(sql);
			if (result > 0)
				System.out.println("삭제성공");
			else
				System.out.println("삭제실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null)
				stmt.close();
			if (stmt != null)
				conn.close();
		}
//		스캐너 종료
		sc.close();
	}
}

//삭제할 부서를 입력하세요 ?
//53
//삭제 성공 ^^