package Ch08_ex02;

// 포도주 
public class Car {
	// 필드 
	String kind;
	// 객체를 멤버변수 타입으로 사용가능 -> 내부에 멤버변수, 메소드가 존재한다
	Engine eg;  // type, cc, print() call by reference 
	//eg = 0x434
	
//	생성자					 call by reference
	public Car(String kind, Engine eg) {
		this.kind = kind;
		// 인스턴스를 그대로 넘겨주면 된다.
		this.eg = eg;
	}
//	메소드
	void print() {
		System.out.println("종류 :" + kind);
		eg.print();
		System.out.println("===============");
	}

	public static void main(String[] args) {
//		연관 관계(association) - 한세트로 사용하기 위해서 객체로 받아들인다
		
		Engine eg1 = new Engine("알파엔진", 2000);	
		Engine eg2 = new Engine("베타엔진", 3000);
		
		Car[] c= new Car[3];		// 참조 변수 배열 생성
		c[0] = new Car("소나타",eg1);			// 객체를 생성해서 배열의 각 요소에 저장
		c[1] = new Car("모 닝",eg1);
		c[2] = new Car("벤츠",eg2);
//		 							c: 소나타, 모닝, 벤츠 = 객체가 넘어가는 것
		for (Car c1 : c) {	// 향상 출력문
			c1.print();
		}
		
//		 비향상 출력문
//		Car c1 = new Car("소나타", eg1);
//		c1.print();
//		Car c2 = new Car("소나타", eg1);
//		c2.print();
//		Car c3 = new Car("소나타", eg2);
//		c3.print();

	}

}


// 미리 만들어둔 객체를 나의 객체에 다시 투입하는 것 어소에이션..? 관계
// 객체와 객체가 사용관계인 경우
