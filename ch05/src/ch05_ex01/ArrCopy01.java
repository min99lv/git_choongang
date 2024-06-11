package ch05_ex01;
//0528
public class ArrCopy01 {			// 배열의 값을 복사하는 예제

	public static void main(String[] args) {
				//	index-->	0, 1, 2, 3, 4, 5, 6 length =6 
				int [ ] a = {1, 2, 3, 4, 5, 6,7};
				int [ ] b = new int [10];
					// System.out.println 복사하는방법을 몰랐을 때
//				for (int i = 0; i < a.length; i++) {
//					b[i] = a [i];
//				}
				System.out.println("----------- a, 0, b, 0, a.length----------------");
				System.arraycopy(a, 0, b, 0, a.length);	
												//	배열을 복사하는 법
												//	 a배열에 0번째 index 부터 복사 -> target b에 index 0부터 복사 --> a.length만큼
												//	(a,        0,                                                   b,              0,                    a.length)
				//	System.out.println("b->" + b);
				pr(b);						// 목적: 배열 값 프린트				==> 모듈화 => 목적 3R => 중요 재사용
				cls(b);					// 목적: 배열값 clear				==> 모듈화
				pr(b);						// 다시 한 번 조회	
				
				System.out.println("----------- a, 0, b, 2, a.length----------------");
				System.arraycopy(a, 0, b, 2, a.length);
				pr(b);						//  a배열 0번째를 b열 두번째부터 복사 a.length만큼 복사
				cls(b);
				
				System.out.println("----------- a, 1, b, 0, a.length-1----------------");
				System.arraycopy(a, 1, b, 0, a.length-1);		
				pr(b);						// a의 인덱스를 1부터 시작했기때문에 사이즈가 맞지 않아서 오류가 나기 때문에 -1을 해준다.
				cls(b);
				
				System.out.println("----------- a, 1, b, 3, a.length-1----------------");
				System.arraycopy(a, 1, b, 3, a.length-1);		
				pr(b);
				cls(b);
}
	private static void cls(int[] b) { // cls 메소드라고 부른다. --> 타입만 맞춰주면 되고 이름은 똑같을 필요없다
			for (int i = 0; i < b.length; i++) {											//	객체로 넘어가면 주소값이 넘어가기 때문에 이름은 상관없다
				b[ i ] = 0; 																				//	배열값을 전부 0으로 clear해준다
			}
		
	}
	//	main에서 호출하는 method는 같은 static (must) ++ int[]=b
	private static void pr(int[] b) {		// 메소드는 치는게 아니라 pr(b) 클릭 
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[ i ] + "\t");
				}
					System.out.println();
		
		
	}

}


// System.out.println("b->" + b);       b->[I@2f92e0f4 객체의 해쉬코드 일련번호
// 배열의 값을 세팅하지 않으면 자동으로 0