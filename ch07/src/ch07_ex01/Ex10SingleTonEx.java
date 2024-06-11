package ch07_ex01;

class SingleTon	{
	String str;
	// private static Single Ton instance = new SingleTon();
	private static SingleTon instance; // sigleTon 선언
	private SingleTon() {	// private 생성자 = 같은 클래스내의 메소드는 나를 이용가능
	} // 외부에서 호출되지 않도록 private								//리턴형
	public static SingleTon getInstance() {		// 메소드이름을 지을때 메소드동작을 관련지어서 짓는다		
		if (instance == null) instance = new SingleTon(); // null이면 싱클톤 아니면 니가 쓰던거 써
		return instance;
	}
}

public class Ex10SingleTonEx {

	public static void main(String[] args) {
			SingleTon st1 = SingleTon.getInstance();// 겟인스턴스를 통해서 호출가능
			//SingleTon st1 = new SingleTon(); // private로 설정되었기때문에 외부에서 보이지 않는다.
			SingleTon st2 = SingleTon.getInstance();	// 객체 자체가 공유되었다
			
			st1.str = "넌 누구";
			System.out.println(st2.str); // 인스턴스가 같기때문에 넌 누구 출력이 된다 // 객체자체공유 
			if (st1 == st2) System.out.println("같다");
			else System.out.println("다르다");
	}

}
//	싱글톤 = 객체의 인스턴스가 오직 1개만 생성되는 패턴
//	싱클톤 사용이유 -> 메모리절감, 데이터공유 용이  사례) db접근
// 	- 반드시 private static 선언을 해주어야한다
// 	- 네이밍룰에 의해서 instance라고 한다.
// 	- sigleTon 클래스를 얻기위해서 getinstance메소드 생성
//  - return형 싱글톤