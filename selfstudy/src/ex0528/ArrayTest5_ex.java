package ex0528;

public class ArrayTest5_ex {

	public static void main(String[] args) {
				String[ ] m  		 = {"이름", "국어", "수학","총점","평균"};
				String[ ] name = {"김준수", "이하이","안예은","국가스텐"};
				
				int [ ][ ] score = {
													{80,70,90},
													{70,90,90},
													{80,70,80},
													{90,90,70}
												};
				int [ ] tot = new int [3]; int sum = 0, avg = 0;		// total배열
				System.out.println("성적표\n");
				
				for ( int i = 0; i < m.length; i++) {
							System.out.print(m[i]+"\t");			// 헤더라인을 뿌려준다
				}
				System.out.println("\n----------------------------------------");
				
				
				

	}

}
