package ch07_ex01;
// hw02
//0529완
class OverLoad{				// 메서드 오버로딩에 관한 연습문제
	int n;
	void print() {
		System.out.println("매개변수없다");
	}
	void print(int n) {
		this.n = n;
		System.out.println("매개변수 1개 int = "+n);
	}
	void print(String s) {
		System.out.println("매개변수 1개 str = "+s);
	}
	void print(String s,int n) {
		System.out.println("매개변수 2개 str ["+ s+"], int"+n);
	}

}
public class Ex07OverLoadingEx {

	public static void main(String[] args) {
		OverLoad Ol = new OverLoad();
		Ol.print();
		Ol.print(12);
		Ol.print("대박");
		Ol.print("금요일",16);
			

	}

}


//console
//매개변수 없다
//매개변수 1개 Int = 12
//매개변수 1개 str대박
//매개변수 2개 str[금요일] , int = 16