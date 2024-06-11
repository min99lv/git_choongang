package ex0530;

public abstract class Shape1 {
	int a = 3;
	
	abstract void draw();
	
	void print() {
		System.out.println("--------선과 점으로 구성됐다.--------");
	}
}

class Rectagle extends Shape1{

	@Override
	void draw() {
		System.out.println("사각형을 그린다");
		
	}
	
	void display() {
		System.out.println("Rectangle 사각형 display를 그린다");
	}
	
}

class Triangle extends Shape1{

	@Override
	void draw() {
		System.out.println("삼.. 각형을 그린다");
		
	}
	
}

class Circle extends Shape1{

	@Override
	void draw() {
		System.out.println("원을 그린다");
		
	}
	
}