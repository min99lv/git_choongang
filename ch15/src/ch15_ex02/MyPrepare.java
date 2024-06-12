package ch15_ex02;

//HW1(MyPrepare)
//1.division TBL 입력 (폰 포함)
//2.prepareStatement 쓰기  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("mysql 부서코드? ");
		String dno = sc.nextLine();
		System.out.println("mysql 부서명? ");
		String dname = sc.nextLine();
		System.out.println("mysql 폰? ");
		String phone = sc.nextLine();
		System.out.println("mysql 위치? ");
		String position = sc.nextLine();

		Connection conn = null;
		PreparedStatement pstmt = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql = "Insert Into division values(?,?,?,?)";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql84");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, phone);
			pstmt.setString(4, position);

			int result = pstmt.executeUpdate();
			if (result > 0)
				System.out.println("mysql division 입력성공");
			else
				System.out.println("mysql division 입력실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

}
