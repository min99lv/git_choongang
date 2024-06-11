package ch02_ex03;
//0523완
public class Ex04Variable05 {		// 정수형과 실수형의 강제형변환에 관한 예제 

	public static void main(String[] args) {		
		int n1 = 90;
		int n2 = 90;
		int n3 = 91;
		int sum;
		double avg1;
		double avg2;
		double avg3;
		double avg4;
		
		sum = n1 + n2 + n3; 				// 같은 데이터 타입을 저장하는 것은 문제가 되지 않는다.
		avg1 = sum /  3;						// [90.0]				--> 형변환을 하지 않아서 나머지가 잘린다
		avg2 = sum / (float) 3; 		// [90.333336] --> 형변환을 했기 때문에 
		avg3 = (float) (sum/3);		// [ 90.0]				--> 나머지를 이미 버린 상태라 
		//정수 결과에 Float형을 선언
		avg4 =  (float) sum / 3 ; // 둘 중 하나만 float을 하면 형변환이 됨 - 순서는 상관 X
	
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균1 = %.1f\n", avg1);
		System.out.printf("평균2 = %f\n", avg2);
		System.out.printf("평균3 = %.1f\n", avg3);
	}

}
