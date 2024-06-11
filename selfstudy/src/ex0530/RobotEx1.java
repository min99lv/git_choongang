package ex0530;

public class RobotEx1 {

	static void action(Robot1 r) {
		if (r instanceof DanceRobot1) {
			DanceRobot1 dr = (DanceRobot1)r;
			dr.dance();
			((DanceRobot1)r).dance();
		} else if (r instanceof DrawRobot1) {
			((DrawRobot1)r).draw();
		} else {
			((SingRobot1)r).sing();
		}
	}
	
	public static void main(String[] args) {
		Robot1[] rb = new Robot1[3];
		rb[0] = new DanceRobot1();
		rb[1]= new DrawRobot1();
		rb[2] = new SingRobot1();
		
		for (Robot1 r : rb) {
			action(r);
		}
		
		

	}

}
