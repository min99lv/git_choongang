package ch05_ex01;
//0528완,0530완
public class Arr01 {			 // 배열을 사용하는 예제01
	public static void main(String[] args) {
		// int a0, a1, a2, a3, a4, a5......; 배열을 사용하는 이유
		int[] a = new int[4]; //
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		// a[4] = 234; // int 배열의 값을 설정해주지 않으면 기본값은 0이 된다.
		int[] b = new int[5];
		b[0] = 7;
		b[1] = 34;
		b[2] = 67;
		b[3] = 6;
		b[4] = 234;

		System.out.println("a. length-->" + a.length);
		// .length 배열의 갯수를 나타내는 코드
		for (int i = 0; i < a.length; i++) {
			// System.out.println("a[" + i + "]=" + a[i]);
			System.out.printf("a [%d] = %d\n", i, a[i]); // 최적화된 코드 --> 형식문자열을 쓰는게 더 깔끔
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]); // 최적화 되지 않은 코드
		}

	}
}

//	for (int i = 0; i < 5; i++) --> 배열의 크기를 바꿨을 때 오류가 날 수 있는 코드 .length를 쓰는것이 좋다
//	ArrayIndexOutOfBoundsException 배열의 범위를 벗어났을 때 나타나는 오류
