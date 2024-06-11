package ex0530;

abstract class C3 {
	
	int k;
	
	public C3() {
		System.out.println("추상 class 생성자");
	}
	
	void setK (int k) {
		this.k = k;
	}
	
	abstract void print();
}

class C4 extends C3{

	@Override
	void print() {
		System.out.println("C2 k->" + k);
		
	}
	void print3 () {
		System.out.println("C2 print3");
	}
	
}





public class OverRide3 {

	public static void main(String[] args) {
		C3 c1 = new C4();
		c1.setK(12);
		c1.print();
		C4 c2 = new C4();
		c2.setK(7);
		c2.print();
		c2.print3();
		
		

	}

}

//console
//추상 class 생성자
//C2 k->12
//추상 class 생성자
//C2 k->7
//C2 print3