package ch15_ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//hw02
// table professor 이용하여 정보 출력 
// 모든 row 순회
public class MySelect02 {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql = "SELECT * FROM scottdb.professor;";
		Scanner sc = new Scanner(System.in);

		Connection conn = null; // DB연결
		Statement stmt = null; // Sql사용
		ResultSet rs = null; // 결과

		System.out.println("MYSQL 교수명단");
		System.out.println("교수번호\t이름\t직위\t급여\t학과코드");
		System.out.println("=================================================");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql84");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				do { // 일반적으로 do while문으로 진행
					int profno = rs.getInt(1); // 숫자 = getInt //7369
					String name = rs.getString(2); // SMITH
					String position = rs.getString(4); // CLERK
					int sal = rs.getInt("sal"); // 800
					int deptno = rs.getInt(8); // 숫자 = getInt //7369
//					if (position.length() > 7) // 칸 맞추는 용 로직
						System.out.printf("%d\t%s\t%s\t%d\t%d\n", profno, name, position, sal, deptno);
//					else
//						System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n", profno, name, position, sal, deptno);}
				}while (rs.next()); // 멀티 로우 실행 , 로우 단위로 실행
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


//MySQL   교수명단
//교수번호	이름	직위	급여	학과코드
//===========================================
//9901	김도훈	교수	500	101
//9902	이재우	조교수	320	201
//9903	성연희	조교수	360	101
//9904	염일웅	전임강사	240	102
//9905	권혁일	교수	450	102
//9906	이만식	부교수	420	101
//9907	전은지	전임강사	210	101
//9908	남은혁	부교수	400	202
