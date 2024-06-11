package ch08_ex04;


// 포도주
public class CarEx {

	public static void main(String[] args) {
//		객체 생성
		Car car = new Car(); 
		
		for (int i = 1; i <=5 ; i++) {
//																6,2,3,4
			int problemLocation = car.run();	// Car클래스 안에 있는 매소드 실행
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire= new HanKookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 FankookTire로 교체");
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
