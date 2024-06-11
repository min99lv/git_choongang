package ex0530;

class A1{
	private int kkk;
	public void print() {
		System.out.println("부모 메소드 print");
		
	}
}

class A2 extends A1{
	public void print3() {
		System.out.println("A2의 print 메소드");
	}
}



public class OverRide1 {
	
	public static void main(String[] args) {
		A1 a1 =  new A1();
		a1.print();
		A1 a2 = new A2();
		a2.print();
		A2 a22 = new A2();
		a22.print();
		a22.print3();
		
		
	}
	
	
	
}




//console
//부모 메소드print
//부모 메소드print
//부모 메소드print
//A2의 print 메소드
