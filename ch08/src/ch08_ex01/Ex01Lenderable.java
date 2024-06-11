package ch08_ex01;
// 인터페이스에 관한 예제
//0530-1
public interface Ex01Lenderable {
	int BORROW = 1; // 인터페이스는 모두 final 변수 
	int NORMAL = 0;	// ㄴ일반 변수 사용 불가능
	// 추상화 메소드들 .... !! (abstract) 생략가능 마음속으로 생각하고 있어야한다 .
	abstract void checkOut(String borrower, String date);
	void checkin();

}

// 클래스 상속 ->extends(상속) c i -> sigle inheritance
// 메소드 상속 ->implements(구현) i i multiple inherritance
class SeperateVolume implements Ex01Lenderable {  // -> 구현
	// 멤버변수
	String title;
	String date;
	String borrower;
	int status; 

	// 생성자
	SeperateVolume(String title) {
		this.title = title;
	}
	
	// 책 대여 메소드  상태 =  nomal
	public void checkOut(String borrower, String date) {
//		NORMAL++; -> 불가능 인터페이스의 변수는 모두 상수다.
		if (status != NORMAL)	// 커뮤니케이션 
			return; // 메소드가 호출된곳으로 돌아가라
		this.date = date;
		this.borrower = borrower;
		status = BORROW;
		System.out.println(borrower + "가"+date + title+"를 대여했다");
	}
	
	// 책 반환 메소드 상태 = borrow
	@Override
	public void checkin() {
		if (status != BORROW)
			return;
		System.out.println(borrower+"가" + title+"을 반납했다.");
		date = null;
		title = null;
		borrower = null;
		status = NORMAL;
	}
}

// 인터페이스 : 모든 메소드가 추상화되어있는 것
// 단독으로 인스턴스 할 수 없다 무조건 구현을 해야한다 ->상속


//예를 들어, SeperateVolume 클래스의 status 변수는 해당 클래스 내에서 선언되었으므로
//checkOut() 메소드와 checkin() 메소드에서 모두 접근 가능합니다. 
//이들 메소드에서 status 값을 변경하면, 그 변경 사항은 같은 인스턴스 내의 다른 메소드들에도 적용됩니다.
//따라서 같은 클래스 내의 블록이 다른 메소드라 할지라도, 클
//래스 내부의 변수는 클래스의 인스턴스 전체에서 공유되므로 값이 공유됩니다.
