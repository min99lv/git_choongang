package ch02_ex03;
//0523완
public class Ex03Variable01 {	//실수 소수점 표현과 형식문자열 예제

	public static void main(String[] args) {
		float f1, f2;
		double d1;
		
		f1 = 10.1f;
		System.out.printf("f1 = %.1f	\n", f1);
		
		f2 = 10.123f;
		System.out.printf("f2 = %.2f	\n", f2); // .2f = 소수점 두번째 자리까지 출력
		
		d1 = 100.17;
		System.out.printf("d1 = %f	\n", d1);
											//double 도 %f 사용 ! 왜냐 %d는 정수가 사용하기 해서 헷갈리기 때문에

	}

}
