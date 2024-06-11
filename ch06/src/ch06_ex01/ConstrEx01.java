package ch06_ex01;

class Sonata {
		int  a;
		String str = "";
		
		public Sonata() {
			System.out.println("난 기본");
		}
		public Sonata(int a) {  // 타입이나 선언 갯수가 달라야한다.
			// this.a = a;
			System.out.println("난 기본 + int1->" +this.a);	// 원래 0
			this.a = a;
			System.out.println("난 기본 + int2->" +this.a); // 인스턴스 4 
		}
		public Sonata(String str) {
			this.str = str;
			System.out.println("난 기본+  str->" + this.str);
		}
}

public class ConstrEx01 {

	public static void main(String[] args) {
			Sonata s1 = new Sonata();
			Sonata s2 = new Sonata(4);
			Sonata s3 = new Sonata("에어백");
			

	}

}
