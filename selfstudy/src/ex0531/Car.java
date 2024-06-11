package ex0531;

public class Car {
	String kind;
//	engine클래스의 객체를 참조하는 변수 = eg
	Engine eg;

	public Car(String kind, Engine eg) {
		this.kind = kind;
		this.eg = eg;
	}

	void print() {
		System.out.println("종류 :" + kind);
		eg.print();
		System.out.println("===============");
	}

	public static void main(String[] args) {
//		엔진 클래스 인스턴스
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);

//		객체배열 참조	
		Car[] c = new Car[3];
		c[0] = new Car("소나타", eg1);
		c[1] = new Car("모 닝", eg1);
		c[2] = new Car("벤츠", eg2);
		
	
		for (Car c1 : c) {
			c1.print();
		} 

	}

}
