package ch03_ex02;
// 과제0523 완료
public class ex0203 {		// 산술연산 연습문제

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수 
		int pencilsPerStudents = 0;
				
		//남은 연필 수 
		int pencilsLeft = 0;
		
		pencilsPerStudents = pencils / students;		// 532 / 30 = 17			int타입이기때문에 나누어떨어지지않는 수는 자른다.
		pencilsLeft = 534 % students;							// 532 % 30 = 24		나머지 계산
		
		System.out.println("학생 한 명이 가지는 연필 수 ->"	+	pencilsPerStudents);
		System.out.println("남은 연필 수 ->"	+	pencilsLeft);
		

	}

}
