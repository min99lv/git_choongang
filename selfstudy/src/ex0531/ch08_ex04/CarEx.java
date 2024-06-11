package ex0531.ch08_ex04;
// 포도주

public class CarEx {

	public static void main(String[] args) {
//		Car 인스턴스
		Car car = new Car(); 
		
		for (int i = 1; i <=5 ; i++) {
//																6,2,3,4
			int problemLocation = car.run();	
//														Car클래스 run메소드 실행
//			run()메소드에서 System.out.println("[자동차가 달립니다]"); 출력
//			앞 오른쪽 바퀴와 6이라는 변수 값을 가지고 Tire클래스의roll()메소드실행
//			생성자에 의해서 location : 앞오른쪽 maxRocation: 6이 저장
//			roll()메소드 실행 accumulatedRocation= 1로 시작
//			return 값 true => roll메소드 종료 run메소드의 실행이 끝나지 않았다
//			true기 때문에 반환값은 0 다시 현재 클래스의 for문으로 오고
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire= new HanKookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.frontRightTire= new HanKookTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("앞 왼쪽 KumhoTire로 교체");
				car.backLeftTire= new KumhoTire("앞 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 kumhoTire로 교체");
				car.backRightTire= new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------------------------------");
		}
	}

}
