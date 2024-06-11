package ch08_ex01;
//0530 hw01 -- 결과보고 완성

public abstract class Ex06Shape {
	
	// 다양한 선언이 가능하다는 예시
	int a = 3;

	abstract void draw();

	void print() {
		System.out.println("--------선과 점으로 구성됐다.--------");
	} // 사용

}

// Shape 상속
class Rectangle extends Ex06Shape {

	// 상속 받은 추상메소드는 반드시 구현해야한다.
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
		
	}
	
	void display() {
		System.out.println("Rectangle 사각형 Display을 그린다");
	}
	
	
}

class Triangle extends Ex06Shape {

	@Override
	void draw() {
		System.out.println("삼..각형을 그린다.");
		
	}

}

class Circle extends Ex06Shape {

	@Override
	void draw() {
		System.out.println("원을 그린다.");
		
	}
	
   
}