package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서를 입력하세요?");
		String deptno = sc.nextLine();
		System.out.println("부서명?");
		String dname = sc.nextLine();
		System.out.println("근무지?");
		String loc = sc.nextLine();

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String sql = " UPDATE DEPT SET DNAME = '" + dname + "', LOC = '" + loc + "' WHERE DEPTNO = " + deptno;
		String sql = String.format("UPDATE dept SET dname = '%s', loc = '%s' WHERE deptno = %s", dname, loc, deptno); 
//		 String sql = String.format ("Update Dept set dname ='%s',"+  "loc='%s' where deptno=%s",dname,loc,deptno);
		System.out.println("sql->"+sql);
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = conn.createStatement();

		try {
			Class.forName(driver);
			int result = stmt.executeUpdate(sql);
			if (result > 0)
				System.out.println("수정성공");
			else
				System.out.println("수정실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null)
				stmt.close();
			if (stmt != null)
				conn.close();
		}
		sc.close();
	}

//		HW01
//		수정할 부서 입력 코드를 이용하여 수정

}

//수정할 부서를 입력하세요 ?
//51
//  부서명 ?
//경영3팀
//  근무지?
//삼성
//수정성공 ^^