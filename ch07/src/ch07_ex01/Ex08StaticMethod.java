package ch07_ex01;
// static 메소드를 이용하는 예제
// 0529
class StaticM	{
	int num = 0;			// 필드 생성
	
	void display () {	// num값을 증가하는 메소드
		num ++;
		System.out.println("메롱num->"+num);
		
	}
	static void print (String str) {		//static 선언 = 공유 메소드
		// num ++;
		System.out.println("대박 수요일"+str);
		// 	Static 메소드는 Static변수만 사용가능
//		System.out.println("num->"+num); // 공유메모리에 인스턴스 변수를 들어가면 오류
	
	}
}

public class Ex08StaticMethod {

	public static void main(String[] args) {
				// static 선언시 객체 생성 없이 호출 가능
				StaticM.print("인스턴스 전");
				StaticM sm =  new StaticM();
				
				sm.display();
				sm.display();
				sm.display();
				sm.print("인스턴스 후");
	}

}


//console
//대박 수요일인스턴스 전
//메롱num->1
//메롱num->2
//메롱num->3
//대박 수요일인스턴스 후
