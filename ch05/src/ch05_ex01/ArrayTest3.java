package ch05_ex01;
// 0528완
public class ArrayTest3 {		// 합계와 평균 최대값 최소값 구하기...연습문제 for문 사용예제
//0530완
	public static void main(String[] args) {
		int array[ ] = {76, 45, 34, 89, 100, 50, 90,92};
		int sum = 0, avg = 0, max = 0, min = 100;
		
		for (int i : array) {
			sum += i;
			if (i > max) 
				max = i;
			if (i < min) 
				min = i;
		}
		avg = sum/array.length;
		
		System.out.println("합계="+sum+"평균="+avg);
		System.out.println("최대값="+max+"최소값="+min);

	}

}


//	합 576 평균 72
//	kk = array[i]

//		i = 0 인 경우
//		sum += 76;
//		1. if1 - 76 > 0 true max = 76;
//		2. if2 - 76 < 100 true min = 76;
//
//		i = 1 인 경우
//		sum = 76 + 45;
//		1. if1 - 45 > 76 false max = 76;
//		2. if2 - 45 < 76 true  min = 45;
//
//		...반복