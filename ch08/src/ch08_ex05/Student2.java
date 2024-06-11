package ch08_ex05;

public class Student2 extends Person2 {
	private String sno;
	
	
	// 							"옥주현", 		23, 	"1203667"
	// 	무 조 건 부모 먼저
	Student2(String name, int age, String sno) {
		super(name, age); // inheritance
		this.sno = sno; // extends
	}
	public void print() {
		super.print();
		System.out.println("학번"+sno);
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	

}
