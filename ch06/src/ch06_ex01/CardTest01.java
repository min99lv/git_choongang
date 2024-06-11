package ch06_ex01;

class Card	{
		String kind; // 인스턴스 변수 = 멤버 변수 = 필드
		int number; 
	
		static int width = 100; // 클래스 변수
		static int heigh = 250;
		
		// 클래스 이름 + ctrl + spacebar  = 생성자 생성
		// 메모리만 할당하는 기본 생성자
		public Card() {
			// TODO Auto-generated constructor stub
		}
		// 메모리도 할당해주고 멤버변수를 초기화해주는 생성자
		public Card(String kind, int number) {	// 타입을 써주어야한다
				this.kind = kind;		// 멤버 변수 이름이랑 같으면 X -> this를 붙여준다
				this.number = number;
		}
}

public class CardTest01 {
	
	public static void main(String[] args) {
			// 객체 생성 --> 기본 생성자
			Card c1 = new Card();
			c1.kind = "heart";
			c1.number =7;
			System.out.print("c1:"+c1.kind+","+c1.number);		// 인스턴스 변수를 가져오는 경우
			System.out.println("\nc1:"+Card.width+","+c1.heigh);	// 클래스 변수를 가져오는 경우
			
			
			// 객체 2 생성 --> 생성자 (memory + 인스턴스 변수 초기화)
			Card c2 = new Card("spade",4); // 
			System.out.print("\nc2:"+c2.kind+","+c2.number);		// 인스턴스 변수를 가져오는 경우
			System.out.println("\nc2:"+Card.width+","+ c2.heigh);	// 클래스 변수를 가져오는 경우
			
	}

}




