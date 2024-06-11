package ch04_ex02;
//0523완
public class SwitchCharEx {			// 스위치를 사용한 문자열 확인 조건문 예제

	public static void main(String[] args) {
		char grade = 'B';				
		
		switch(grade) {			//	위에 있는 grade 에 저장된 값으로 조건문이 실행된다
			case 'A':
			case	'a':					// 대,소문자 구분을 하지 않기 위해서 switch문을 여기서 사용한다
					System.out.println("우수 회원입니다.");
					break;
			case 'B':
			case 'b':
					System.out.println("일반 회원입니다.");
					break;
			default:
					System.out.println("손님입니다.");
		}

	}

}
