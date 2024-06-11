package ch10_ex03;

public class Ex02 {
	static void method(boolean b) {
		try {
			System.out.println(1); // 2.출력, 7. 출력
			if (!b)
				System.exit(0); // 시스템을 완전히 빠져나가라
			System.out.println(2); //3. 출력
		} catch (RuntimeException r) {
			System.out.println(3); 
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // 4. 출력
		}
		System.out.println(6);	// 5. 출력
	}

	public static void main(String[] args) {
		System.out.println("------------True 시작-------------"); // 1.출력
		method(true);
		System.out.println("------------False 시작-------------"); // 6. 출력
		method(false);
	}

}


//console
//------------True 시작-------------
//1
//2
//5
//6
//------------False 시작-------------
//1

