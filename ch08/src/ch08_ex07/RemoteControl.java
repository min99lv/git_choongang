package ch08_ex07;
// 인터페이스 ***
public interface RemoteControl {
//	상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

//	Jave 8 이상
//	-------------------------------------------------------------------------
//	디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
//	하나 이상의 default메소드도 사용 가능
	default void setMute2(boolean mute) {
		if (mute) {
			System.out.println("setMute2무음 처리합니다.");
		} else {
			System.out.println("setMute2무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
//	-----------------------------------------------------------------------

}
