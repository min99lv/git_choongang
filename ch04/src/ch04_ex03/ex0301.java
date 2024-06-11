package ch04_ex03;
//hw06
//0524완
public class ex0301 {

	public static void main(String[] args) {
		int sum = 0;
		//	 for문을 이용 1부터 100까지 3의 배수의 합을 구하라
		for (int i = 3; i<100; i++) {
			System.out.println("i - - >" + i);		//진행과정을 확인하는 코드
			if(i % 3 == 0)
			sum += i;
		}
			System.out.println("3의 배수의 합:"+sum);
		
	}

}
//3의 배수의 합 : 1683