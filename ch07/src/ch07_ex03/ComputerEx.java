package ch07_ex03;

public class ComputerEx { // 배열을 사용하는 클래스 예제

	public static void main(String[] args) {
		Computer myCom = new Computer(); // 컴퓨터 인스턴스

		int[] values1 = { 1, 2, 3 }; // 배열 값 선언
		int result1 = myCom.sum1(values1); // 선언한 후에 값을 넘겨주는 방법
		System.out.println("result1 : " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 }); // 선언하면서 값을 넘겨주는 방법
		System.out.println("result2 : " + result2);

		int result31 = myCom.sum2(1, 2);  // 배열로 안넘겨줘도 ...에서 배열로 취급 방법이 편하다.
		System.out.println("result3: " + result31);
		int result32 = myCom.sum2(1, 2,3); // 가변변수
		System.out.println("result3: " + result31);
		System.out.println("result3: " + result31);
		int result41 = myCom.sum2(1, 2,3,4,5); 
		System.out.println("result3: " + result31);
	}

}


//결과
//result1 : 6
//result2 : 15
//values->[I@72ea2f77
//values[i]->1
//values[i]->2
//result3: 3
