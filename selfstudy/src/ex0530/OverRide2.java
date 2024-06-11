package ex0530;

class B1{
	void print1() {
		System.out.println("바꾸기가능");
	}
	final void print2() {
		System.out.println("변경금지");
	}
}

class B2 extends B1{
	void print1() {
		System.out.println("난 자식 메소드");
	}
}

public class OverRide2 {

	public static void main(String[] args) {
		B1 b1 = new B2();
		b1.print1();
		b1.print2();

	}

}



//console
//난 자식 메소드
//변경금지