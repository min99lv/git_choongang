package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc03 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 oracle 사원코드?");
		String empno = sc.nextLine();

		Connection conn = null;
//		오라클에 저장된 프로시저 객체
		CallableStatement cs = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "{? = call func_sal(?)"; // 중괄호 닫는 것은 있어도 되고 안해도됨
//								?:꺼내가지고 올 파마메타 (?:입력한 파마메터)
		try {
			Class.forName(driver); // 없어도 될 수 있음, 연결 되어있다면
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setString(2, empno); // 변경 사번
			cs.registerOutParameter(1, java.sql.Types.DOUBLE); // 변경 급여
			cs.executeQuery();
			Double sal = cs.getDouble(1); // double로 선언했기때문에 double로 받아야한다.

			if (sal > 0) {
				System.out.println("oracle callablestatement 수정 성공");
				System.out.println("변경 사번:" + empno);
				System.out.println("변경 급여:" + sal);

			}
		} catch (Exception e) {
			System.out.println("수정 실패");
		} 
//		finally {
//			if (cs != null) {
//				cs.close();
//			}
//			if (conn != null) {
//				conn.close();
//			}
//		}

	}

}
