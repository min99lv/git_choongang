package ch05_ex01;
// 0528완, 0530완
public class Arr02 {				// 배열을 사용하는 예제02

	public static void main(String[] args) {
				int[ ] a = new int[ ] {23, 45, 67, 789, 2};					//	배열을 선언하면서 값을 줄 수 있다 new 새로운 메모리를 생성
				int[ ] a2 = {23, 45, 67, 789, 2};										// 	선언 방법 
				int a3[ ] =  {23, 45, 67, 789, 2};										// 	선언 방법 2
				
				System.out.println("======일반형 for문======");
				for (int i = 0; i < a.length; i++) {
						System.out.println("a["  + i + "]=" + a[i]);					
				}
				System.out.println("======*향상형 for문(실무)*======");	// 잘 알아두기
				//						a =  {23, 45, 67, 789, 2} -> int 배열이기 때문에 int kk
				for (int kk : a) {		
					System.out.println("kk->" + kk);
				}
	}

}


/*
======향상형 for문======
kk->23			포인터가 자동으로 이동함 !!!!!!!!!! 
kk->45
kk->67
kk->789
kk->2
*/