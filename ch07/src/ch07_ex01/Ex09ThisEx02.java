package ch07_ex01;
//0529-2	오버라이딩 생성자의 매개변수에 관한 예제
//0529완
class G2 {
	int k;	 // 필드 생성

	G2() {
		System.out.println("매개변수 없다");
	}

	G2(int k) {
		this(); // 나의...() 라는 의미 기본생성자 를 가르킴 -> 다음에 내 생성자를 뿌려줌
		this.k = k; // 나의 매개변수를 가르킴
		System.out.println("매개변수 1개 k = " + k);

	}

	G2(int k, int y) {
		this();
		this.k = k;
		System.out.println("매개변수 2개 k = " + k + " y = " + y);
	}

	void print() {
		System.out.println("k = " + k);
	}

}

public class Ex09ThisEx02 {

	public static void main(String[] args) {
		G2 g2 = new G2(7);					// 두번째 생성자 
		g2.print();										// [매개변수 1개 k=7]
		G2 g3 = new G2(7, 13);			// 세번째 생성자
		g3.print();										// [매개변수 2개 k = 7 y = 13]
		
	}

}




//console
//매개변수 없다					--> 생성자안에 있는 this(); 라는 것 때문에 출력 -> 기본생성자를 먼저 뿌려주라는 의미
//매개변수 1개 k = 7
//k = 7
//매개변수 없다
//매개변수 2개 k = 7 y = 13
//k = 7
