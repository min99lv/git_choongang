package ch06_ex01;

import ch06_ex09.PakTest01;
// 패키지가 다를 경우 임포트가 나온다
public class PacTestEx {

	public static void main(String[] args) {
		PakTest01 pt = new PakTest01();
		pt.a = 10;
		pt.b = 27;  
		pt.print();
	}

}



// 패키지가 다른곳에 되어있어도 인스턴스 가능
