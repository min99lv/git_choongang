package ch07_ex03;
// hw03 메소드완성
public class Carculator {
	void powerOn(){
		 System.out.println("전원을 켭니다");
		}
		
		int plus(int x, int y) {
			int replus = x+y;
			return replus;
		}
		
		double divide(int x, int y) {
			if ( y == 0) {
				System.out.println("y가 0이야 0으로 못나눠");
				return y;
			} else {
				double redivide = (double)x/y;
				return redivide;
			}
		}
		
		void powerOff() {
			System.out.println("전원을 끕니다");
		}
}
