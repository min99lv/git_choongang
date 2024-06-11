package ch05_ex01;
// 0528완
// debug 대상
public class MultiArr01 {		// 	이차원배열을 사용하는 예제

	public static void main(String[] args) {
		int [][] a = new int [2][3];		// 2행 3열
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		for (int i = 0; i < a.length; i++) {			// 행 2
			for (int j = 0; j <a[i].length; j++) { 	// 열 3
				System.out.print("일반 for " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======향상 for ======");
    	for (int[] k1 : a) { 		// a[0], a[1] 행 순서 1차원 배열을 통째로 넘겨준다 
    		for (int k2 :k1) { 	// 0번행 a[0]--> [0][0], [0][1], [0]2]
    											// 1번행 a[1]--> [1][0], [1][1], [1]2]
    			System.out.print("향상 for " + k2 + "\t");
    		}
    		System.out.println();
			
		}

	}

}
