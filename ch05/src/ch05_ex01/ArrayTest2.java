package ch05_ex01;
//0528완, 0530완
public class ArrayTest2 {			// 배열을 사용해서 화폐단위로 나누고 나머지를 구하는 예제

	public static void main(String[] args) {
			int money = 2680;										// 현재 가지고 있는 금액
									// 00	 01	 02	 03
			int [ ] unit = {500, 100, 50, 10};				// 화폐단위의 배열
			
			// 각각의 동전이 최대한 나올 수 있는 count
			for(int i = 0; i < unit.length; i++) {		
				int cnt = money / unit[ i ];					// 카운트 = 돈 / 배열0(단위) 
				System.out.println(unit[ i ] + "원 짜리:" + cnt + "개"); 
				// 2680 - 2500 = 180원
				money %= unit[ i ];									// 나머지 = 돈 % 배열0(단위)
				System.out.println("money->" + money);
			}
	}

}
