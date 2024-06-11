package ch02_ex01;
//0522완
public class BooleanEx {				//	논리 타입 변수 예제

	public static void main(String[] args) {
		boolean goStop = true;			//	변수 선언 & 초기화 boolean-> 참 아니면 거짓뿐
		//boolean goStop = false;
		
		if(goStop) {									//	만약 gostop이 참이면 밑줄 실행
			System.out.println("시작합니다.");  
		} else { 											//	if가 거짓이면 else 밑줄 실행
			System.out.println("중지합니다."); 
		}

	}
 
}

