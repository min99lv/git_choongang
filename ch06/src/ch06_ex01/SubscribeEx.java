package ch06_ex01;

class Subscribe {
		public String name;							//	선언 하지 않으면 디폴트 / 퍼블릭 공용..
		private String telnum;					// private 같은 클래스 안에서만 접근가능한 ...
		//ㄴ 동일 class 내부에서만 접근가능
		private int age;								
		
		Subscribe(String n, String t, int a) {
				name = n;
				telnum = t;
				age = a;
		}
		Subscribe(String n) {
				name = n;
		}
		void ChgTelNum(String t)	{
				telnum = t;
		}										//메소드를 통해서는 필드에 접근할 수 있다..
		void ChgAge(int a)	{
				if ( a> 0)				age = a;							// 나이는 음수가 될 수 없기때문에
				else						System.out.println("말이 되나요");
		}		
		void print()	{
				System.out.printf("이름 : %s 전화번호 : %s 나이: %d \n", name, telnum,age);
		}
		
}

public class SubscribeEx {

	public static void main(String[] args) {
			Subscribe s1 = new Subscribe("이성계 ", "010-2223-5567",45);
			Subscribe s2 = new Subscribe("김유신");
			s1.print();
			s2.print();
			//	s2.TelNum = "02- 344-7788" 	// telnum이 프라이빗으로 선언되어있으면 다른 클래스에서는 사용 불가능
			s2.ChgTelNum("02-344-7788");	// 캡슐화 메소드를 통해서만 사용가능한 필드
			s2.ChgAge(33);
			s2.print();
			
			

	}

}
// private로 필드를 선언한 후 메소드로 호출해서 사용하면 캡슐화 되기 때문에 유지보수가 쉽다 