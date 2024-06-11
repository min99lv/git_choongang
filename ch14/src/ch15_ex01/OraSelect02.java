package ch15_ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OraSelect02 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Select * From emp";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무\t\t 급여\t 일자");
		System.out.println("==================================================");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
//			7369	SMITH		CLERK			7902	80/12/17	800					20  // 한 줄 = 로우 
//			7499	ALLEN		SALESMAN	7698	81/02/20	1600	300		30
//			7521	WARD		SALESMAN	7698	81/02/22	1250	500		30
//			7566	JONES		MANAGER	7839	81/04/02	2975				20
//			7654	MARTIN	SALESMAN	7698	81/09/28	1250	1400	30
//			7698	BLAKE		MANAGER	7839	81/05/01	2850				30
//			7782	CLARK		MANAGER	7839	81/06/09	2450				10
//			7788	SCOTT		ANALYST		7566	87/07/13	3000				20
//			7839	KING			PRESIDENT				81/11/17	5000				10
//			7844	TURNER	SALESMAN	7698	81/09/08	1500	0			30
//			7876	ADAMS		CLERK			7788	87/07/13	1100				20
//			7900	JAMES		CLERK			7698	81/12/03	950					30
//			7902	FORD	ANALYST				7566	81/12/03	3000				20
//			7934	MILLER		CLERK			7782	82/01/23	1300				10
			if (rs.next()) {
				do {
					int empno = rs.getInt(1); // 숫자 = getInt //7369
					String ename = rs.getString(2); //SMITH
					String job = rs.getString(3); //CLERK
					int sal = rs.getInt("sal"); //800
					Date date = rs.getDate("hiredate"); //80/12/17
					if (job.length() > 7) // 칸 맞추는 용 로직
						System.out.printf("%d\t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
					else
						System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n", empno, ename, job, sal, date);
				} while (rs.next()); // 멀티 로우 실행 , 로우 단위로 실행 
			} else {
				System.out.println("date No");
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
	}

}

//사원명단
//사원코드	 사원명	 업무		 급여	 일자
//==================================================
//7369	SMITH	CLERK		800	1980-12-17
//7499	ALLEN	SALESMAN	1600	1981-02-20
//7521	WARD	SALESMAN	1250	1981-02-22
//7566	JONES	MANAGER		2975	1981-04-02
//7654	MARTIN	SALESMAN	1250	1981-09-28
//7698	BLAKE	MANAGER		2850	1981-05-01
//7782	CLARK	MANAGER		2450	1981-06-09
//7788	SCOTT	ANALYST		3000	1987-07-13
//7839	KING	PRESIDENT	5000	1981-11-17
//7844	TURNER	SALESMAN	1500	1981-09-08
//7876	ADAMS	CLERK		1100	1987-07-13
//7900	JAMES	CLERK		950	1981-12-03
//7902	FORD	ANALYST		3000	1981-12-03
//7934	MILLER	CLERK		1300	1982-01-23
