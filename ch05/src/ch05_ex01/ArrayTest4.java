package ch05_ex01;
/////개 복습해야함 디버깅 이해 잘안감 ㅜㅜㅜㅜㅜㅜ
// 디버그 02
public class ArrayTest4 { // 배열의 값을 교환하는 예제 == sorting

	public static void main(String[] args) {
			int array[] = { 76, 45, 34, 89, 100, 50, 90, 92 };
			int Temp = 0;
	
			for (int i = 0; i < array.length; i++) {
					for (int j = i + 1; j < array.length; j++) { // i = 0 이면 j=1
							if (array[i] > array[j]) {
 							Temp = array[i]; // 데이터를 교환할 때 쓰는 방법
							array[i] = array[j];
							array[j] = Temp;
							}
					}
			}
			for (int i = 0; i < array.length; i++) {
					System.out.print(" " + array[i]);
			}

	}

}

// i = 0 -> j = 1 -> if (76 > 45) -> true -> Temp = 76; -> {76 <= 45} -> {45 => 76} 순서가 바뀐다 == { 45, 76, 34, 89, 100, 50, 90, 92 };
// i = 1 -> j = 2 -> if (76 >3
