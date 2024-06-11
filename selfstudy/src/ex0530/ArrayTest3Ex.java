package ex0530;
//  배열을 이용해서 최댓값 최소값 합계를 구하는 예제
public class ArrayTest3Ex {

	public static void main(String[] args) {
		int array[ ] = {76, 45, 34, 89, 100, 50, 90,92};
		int sum = 0, avg = 0, max = 0, min = 100;
		
		for (int i : array) {
			sum += i;
			if (i > max)		max = i;
			if (i < min)			min  = i;
		}
		avg = sum/array.length;
		
		System.out.println("합계="+sum+"평균="+avg);
		System.out.println("최대값="+max+"최소값="+min);

	}

}
