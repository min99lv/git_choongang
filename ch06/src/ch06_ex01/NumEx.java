package ch06_ex01;

class AA1	{
		int num1;
		static int num2;			// 멤버변수를 선언할 때 스태틱으로 선언하면 공유변수가 된다
		public AA1() {
				num1++;					// 인스턴스될때마다 값이 초기화 된다
				num2 ++;					// 클래스 변수 = 공유 변수이므로 인스턴스 되어도 값이 초기화 되지 않음
		}
		void print() {
				System.out.println("num1= " + num1 + " num2= " + num2);
		}
}

public class NumEx {

	public static void main(String[] args) {
		AA1 a1 = new AA1();			// num 1= 1 num2 =1
		a1.print();									
		AA1 a2 = new AA1();			// num1=1 num2=2
		a2.print();
		AA1 a3 = new AA1();			// num1=1 num2=3
		a3.print();
			

	}

}
