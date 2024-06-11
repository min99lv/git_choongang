package ch08_robot;

import ch08_robot.actions.FireAction;
import ch08_robot.actions.FlyAction;
import ch08_robot.actions.KnifeAction;

public abstract class Robot {
//	멤버변수 선언	
	public FlyAction flyAction;
	public FireAction fireAction;		//       칼없다 				목검 						레이저검
	public KnifeAction knifeAction; // 객체 knifeNo, knifeWithWood, knifeWithLaxer

	public Robot() {

	}

//		추상메소드
	public abstract void Shape();

//		일반 메소드
	public void actionFly() {
			flyAction.fly();
	}
	public void actionFire() {
		fireAction.fire();
	}
	public void actionKnife() {
		knifeAction.knife();
	}

	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통이 있죠.");
	}

//		필요시 세터메소드만 선언가능
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}

	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	

}
