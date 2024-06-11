package ch08_robot;
// 포도주
public class MainClass {

	public static void main(String[] args) {
		System.out.println("SuperRobot주문. 만들어 주세요");
		Robot superRobot = new SuperRobot();
		superRobot.Shape();
		// super 메소드 -> sub에 없으면 super에서 가져온다
		superRobot.actionBasic();
		superRobot.actionFly();
		// 로봇이 플라이 선언 -> fly메소드 
		superRobot.actionFire();
		superRobot.actionKnife();
		
		System.out.println("---------------------------------");
		System.out.println("StandardRobot이 주문. 만들어주세요");
		Robot standardRobot = new StandardRobot();
		standardRobot.Shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		
		
		System.out.println("---------------------------------");
		System.out.println("CheapRobot이 주문. 만들어주세요");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.Shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
	}

}
