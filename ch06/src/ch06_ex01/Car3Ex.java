package ch06_ex01;

public class Car3Ex {

	public static void main(String[] args) {
		// Car3에 대한 c1, c2, c3, 선언 
		//	Car3 c1 = new Car3("소나타", 10, 14); 
		
		// memory만 할당
		Car3 c1 = new Car3(); 
		// memory할당 + instance변수 초기화
		Car3 c2 = new Car3("다마스", 9, 20); 
		Car3 c3 = new Car3("모닝", 12, 13);
		// 생성자가 있기때문에 선언과 동시에 값을 초기화 해줄 수 있다.
		
		c1.name = "소나타";
		c1.inTime = 10;
		c1.outTime = 14;
		
		c1.print();
		c2.print();
		c3.print();
		
	}

}

//	inTime = inTime;		//멤버변수와 초기화값이 같으면 this. 를 붙인다	
//	차 이름:소나타
//	입고시간:0
//	출고시간:14
//	주차요금:42000
