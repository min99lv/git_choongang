package ch10_ex04;

// 개발자가 예외를 스스로 만들 수 있다 
public class MyException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg;
//		비지니스  로직 오류 가정
		errMsg = "아니 10보다 크다니";
		return errMsg;
	}
}
