package ch05_ex01;
//0528완
public class ArrTest01 {

	public static void main(String[] args) {
			int a [ ][ ] = { {1,2,3,4,5},							// 1행1열 = 1[0][0]
									 {11,12,13,14,15}, 			// 2행2열 = 12 [1][1]
									 {21,22,23,24,25}				// 3행4열 = 24 [2][3]
									};
			
		 System.out.println("시작");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + "\t");
				} 	// inner for
				System.out.println();
			} // out for

	}

}
// 2차원 배열에서 배열의 크기를 가르키는 것은 행의 크기 ==> a.length
// a배열의 행에서 열의 크기를 가르키는 것 ==> a[j].length

