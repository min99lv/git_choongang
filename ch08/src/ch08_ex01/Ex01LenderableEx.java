package ch08_ex01;

public class Ex01LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("젊은 베르테르 슬픔"); // sv 인스턴스
		sv.checkOut("정승환/박윤하", "2024/03/21"); 
	    sv.checkin();

	}

}


//console
//정승환/박윤하가2024/03/21젊은 베르테르 슬픔를 대여했다
//정승환/박윤하가젊은 베르테르 슬픔을 반납했다.