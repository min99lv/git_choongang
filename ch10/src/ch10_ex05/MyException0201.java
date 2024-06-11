package ch10_ex05;
// 최소 급여

public class MyException0201 extends Exception {
	@Override
	public String getMessage() {
				String ErrMsg;
				ErrMsg = "사장님 100만원 보다 적어요 !! 이 뭡니까";
				return ErrMsg;
	}
}
