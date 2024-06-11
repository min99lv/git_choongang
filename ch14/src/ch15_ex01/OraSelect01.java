package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서 코드를 입력하세요");
		int deptno = sc.nextInt(); // 숫자 입력
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//								 하나의 입력 코드 -> 가독성이 좋음  다른방법 : String format
		String sql = "Select dname, loc From Dept Where deptno =" + deptno;
		Connection conn = null; // DB
		Statement stmt = null; 	// Sql
		ResultSet rs = null; // select시 결과 값 저장 --> Select를 했을경우 반드시 ResultSet사용
		
		System.out.println("sql->"+sql); // 개발자 확인용

		try {
			Class.forName(driver); // Driver
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement(); // stmt
			rs = stmt.executeQuery(sql); // SQL -> Select:executeQuery
//			rs Row   
			if (rs.next()) { // 있으면 가져오기 = lterator
				String dname = rs.getString("dname"); // rs.getString(1) <-- dname
//				String loc = rs.getString("loc"); // rs.getString(2) <-- loc
				String loc = rs.getString(2) ;
				System.out.println("부서코드 :" + deptno);
				System.out.println("부서명 :" + dname);
				System.out.println("위치 :" + loc);
			} else {
				System.out.println("자료가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		sc.close();
	}

}


//console
//부서 코드를 입력하세요
//51
//sql->Select dname, loc From Dept Where deptno =51
//부서코드 :51
//부서명 :회계1팀
//위치 :신촌
