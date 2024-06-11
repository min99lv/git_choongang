package ch10_ex05;

public class MyExceptionEx02 {
	// 1.최소급여
	// java MyExceptionEx02 num1
	// 사장님 100만원 보다 적어요 !! 이 뭡니다
	// 2.최대급여
	// java MyExceptionEx02 num1
	// 사장님 1000만원 넘 많아요 , 좀 적당히 합시다

	// 3.정상급여
	// java MyExceptionEx02 num1
	// 정상실행.
	// 4.잘못된 수행
	// java MyExceptionEx02 num1
	// 실행 매개값의 수가 부족합니다.
	// [실행 방법]
	// java MyExceptionEx2 num1
	public static void main(String[] args) {
//		비즈니스 룰
//		최소급여 100만원  ~ 최대급여 1000만원
//		프로그램이 정상
		System.out.println("Java MyExceptiob02  num1");

		try {
			int kkk = Integer.parseInt(args[0]);
			System.out.println("정상급여");
			if (kkk < 100) {
				throw new MyException0201();
			} else if (kkk > 1000) {
				 throw new MyException0202();
			} else  {
				throw new Exception();
			} 
		} catch (MyException0201 e) {
				System.out.println(e.getMessage());
		} catch (MyException0202 e) {
				System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다 \n [실행 방법]\r\n" + "	// java MyExceptionEx2 num1");
		}


	}

}
