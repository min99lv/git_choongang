package ch10_ex02;

public class Throw01 {
	public static void main(String[] args) {
		System.out.println("안녕");
//		사용자 정의 에러 생성
		Exception e1 = new Exception("내가 Error 만들었다"); // 2. 출력
		
		try {
			System.out.println("e1  1");	// 1. 출력
			throw e1; // e1을 던진다.
//			System.out.println("이건 안출력"); -> throw를 했기 때문에 도달하지 못함 
//											e1 = e2 이름만 다르다.
		} catch (Exception e2) {
//													= 내가 Error 만들었다
			System.out.println(e2.getMessage()+"kkk"); // 3. 출력
		}
		System.out.println("프로그램이 정상 종료되었음."); // 4. 출력
	}

}
