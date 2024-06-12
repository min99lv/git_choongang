package ch15_ex01;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ?"); String deptno1 = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ?"); String dname = sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ?"); String loc = sc.nextLine();

		Connection conn = null;
 //		Procedure 호출 = callableStatement 객체 사용
		CallableStatement cs = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		Procefure Call 할때의 Format
		String sql = "{call dept_Insert(?,?,?)}";
		
		try {
//			드라이브 잡기
			Class.forName(driver); // 없어도 될 수 있음, 연결 되어 있다면
//			연결
			conn = DriverManager.getConnection(url,"scott","tiger"); 
//			실행
			cs = conn.prepareCall(sql); // 준비할때 sql 
			cs.setString(1, deptno1); // 칼럼명과 달라도 상관없다
			cs.setString(2, dname);
			cs.setString(3, loc);
			int result = cs.executeUpdate();
			if(result > 0) System.out.println("Oracle CallableStatement 입력 성공");
			else System.out.println("Oracle CallableStatement 입력 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(cs != null) cs.close();
			if(conn != null) conn.close();
			
		}
		
	}

}
