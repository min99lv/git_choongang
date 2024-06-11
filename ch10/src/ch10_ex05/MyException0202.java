package ch10_ex05;
// 최대 임금 Error Msg
// hw02
public class MyException0202 extends Exception {
	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "사장님 1000만원 넘 많아요 , 좀 적당히 합시다";
		return ErrMsg;
	}
}
