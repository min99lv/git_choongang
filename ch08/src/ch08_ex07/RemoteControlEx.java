package ch08_ex07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setVolume(15);
		rc.setMute(false);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.setMute2(false);

	}

}
