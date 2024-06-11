package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeWithWood;

public class StandardRobot  extends Robot{

		public StandardRobot() {
			flyAction = new FlyNo();
			fireAction = new FireOk();
			knifeAction = new KnifeWithWood();
		}
	@Override
	public void Shape() {
		System.out.println("기본적으로 팔, 다리, 몸통, 존재. 그리고 달릴 수 있습니다.");
		
	}
	
}

