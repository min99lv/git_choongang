package ex0529;

public class Ex01CallByValue {

	public static void main(String[] args) {
		int number = 10;
		increment(number);												// increment 메서드에 값 전달
		System.out.println("number="+number);	// [number = 10]
		// 메소드내에서 number = 11이 된 것 같지만
		// number 자체의 값은 변하지 않는다
		
	}
	public static void increment(int number) {
		number = number + 1;		// 11
		
	}

}


// increment 메서드 호출 시 전다된 파라미터 값 number(10)은 복사본이 만들어져서
// 메서드 안에서만 변경이 되고 원본 number은 변경이 되지 않는다.