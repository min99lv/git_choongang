package ch06_ex01;

public class CarEx {
// main을 포함한 클래스 = 실행클래스
//	객체를 선언할때 컨트롤 스페이스 -> 패키지를 잘 확인한다
	public static void main(String[] args) {
			// 		선언 (instance)		생성	
			Car myCar = new Car();	// 메모리를 생성 -> 마이카에 주소번지를 넘겨준다
			// 객체를 선언 해주지 않으면 메소드나 변수를 사용할 수 없다.
			Car yourCar;						// 객체명 reference 변수명 & 선언방법2
			yourCar = new Car();		// 생성 -> car 대한 메모리번지 생성
			
			// ctrl+spacebar car 타입 객체의 조상은 오브젝트
			myCar.color = "빨강";
			myCar.speed = 200;
			yourCar.color = "초록";
			yourCar.speed = 150;
			myCar.speedUp();
			myCar.print();
			yourCar.print();
				
			

	}

}


// car 클래스를 선언해주었을 때 내가 이름을 부여해주면 인스턴스가 된다
// 멤버 변수는 기본적인 성격 개념이다.
// 메소드는 성격에 대한 규정을 하는 것
// 괄호가 없는 것 속성 // 괄호가 있는 것 메소드


