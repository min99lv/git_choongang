package ch05_ex01;
//0528
public class ArrayTest5 {			// 배열을 이용하여 성적표를 출력하는 예제

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
			
			
			for (int i = 0; i < score.length; i++)  {		
					System.out.print(name[i]+"\t");					//	name을 i만큼 먼저 뿌린다
					for (int  j = 0; j < score[i].length; j++) {		//	점수를 i
							System.out.print(score[ i ][ j ] + "\t");
							sum+=score[ i ][ j ];
							tot[j] += score[ i ][ j ]; // j는 과목의 총계
					}
					avg = sum / score[i].length;
					System.out.println(sum + "\t"+avg);
					sum = 0;
			}
			
			
			int totAvg, totSum =0;
			
			for (int j = 0; j <3; j++) {
					System.out.println(tot[j]+"\t");
					totSum += tot[j];
			}
			totAvg = totSum/ (score[0].length*name.length);
			System.out.println(totSum+"\t"+totAvg);
			
	}

}
	

//이름 출력 점수 출력 통계출력 평균출력 다음줄로 넘어가기


			
//			성적표 
//
//			이름	국어	영어	수학	총점	평균	
//			--------------------------------------------
//			김준수	80	70	90	240	80
//			이하이	70	90	90	250	83
//			안예은	80	70	80	230	76
//			국카스텐	90	90	70	250	83
//			--------------------------------------------
//			총계	320	320	330	970	80