package ex0529;

public class Ex02CallByReference {

	public static void main(String[] args) {
		int[] numbers = {10};
		increment(numbers);
		System.out.println("number ="+numbers[0]);

	}
	
	private static void increment(int[] numbers) {
		numbers[0] = numbers[0]+1;
	}

}


// 배열에 대한 복사본이 전달되는 것이 아니라 메서드에 주소를 전달하여 참조하게된다
