package ch03_ex02;
//0523완
public class ex0201 {		//	단항 연산자 연습문제

	public static void main(String[] args) {
		int x = 10;							// x = 10
		int y = 20;							// y = 20
		int z = (++x)	+ (y--);		// z = 11 + 20 =31 
		System.out.println("x->"+x); 
		System.out.println("y->"+y);
		System.out.println("z->"+z); 
		//System.out.println(y); 

	}

}
