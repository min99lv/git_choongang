package ch09_ex03;

public class String1 {
	public static void main(String[] args) {
		String a1 = "Java";		// 문자열 상수를 생성자에 전달해서 String 객체를 생성한 예
		String a2 = "Java";		// 위랑 같은 메모리번지를 찾는다.
		String a3 = new String("Java");	// String객체에 문자열 리터럴을 저장
		String a4 = new String("java");
		System.out.println(a1 + "," + a3 + "," + a3);
		// in String -> 메모리 주소 비교
		if (a1 == a2)			System.out.println("a1과 a2는 같다");
		else						System.out.println("a1과 a2는 다르다");
		if (a1 == a3)			System.out.println("a1과 a3는 같다");
		else						System.out.println("a1과 a3는 다르다");
		
		// in String -> 문자열 비교
		if (a1.equals(a2))		System.out.println("equals a1과 a2는 같다");
		else								System.out.println("equals  a1과 a2는 다르다");
		if (a1.equals(a3))		System.out.println("equals  a1과 a3는 같다");
		else								System.out.println("equals  a1과 a3는 다르다");
		
		if (a1.equals(a4))		System.out.println("a1과 a4는 같다");
		else								System.out.println("a1과 a4는 다르다");
		if (a1.equalsIgnoreCase(a4))		System.out.println("a1과 a3는 같다");
		else								System.out.println("a1과 a3는 다르다");
		if (a3.equalsIgnoreCase(a4))		System.out.println("a3 과 a4는 같다");
		else								System.out.println("a3과 a4는 다르다");
		
		

	}
}



// console
// Java,Java,Java
// a1과 a2는 같다
// a1과 a3는 다르다
// equals a1과 a2는 같다
// equals  a1과 a3는 같다
// a1과 a4는 다르다
// a1과 a3는 같다
// a3 과 a4는 같다