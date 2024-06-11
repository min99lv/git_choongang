package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 ?");
//					 필드명하고 맞춤
		String deptno = sc.nextLine();
		System.out.println("부서명 입력 ?");
		String dname = sc.nextLine();
		System.out.println("위치 입력 ?");
		String loc = sc.nextLine();

		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost ->  127.0.0.1;, port 번호 : 1521, xe(orcl) -> Service ID(Sid)
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost = 내pc
//		String url = "jdbc:oracle:thin:@172.30.1.79:1521:xe"; // 다른사람 pc 
//		ex -->INSERT INTO DEPT  VALUES(50,'영업1팀','이대')
//																sql은 대소문자 구분 X
		String sql = String.format("Insert Into dept Values(%s, '%s', '%s')", deptno, dname, loc);
		System.out.println("sql -> " + sql);
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
//			result set  executeUpdate= 행의 수를 반환함
			int result = stmt.executeUpdate(sql); // 실행 insert -> executeUpdate
			if (result > 0)
				System.out.println("입력성공");
			else
				System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
//			객체 사용종료
			if (stmt != null)
				stmt.close();
			if (stmt != null)
				conn.close();
		}
		sc.close();
	}

}
