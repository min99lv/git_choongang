package ex0528;

public class Car1class {
	String color;
	int speed;
	int wheel;
	
	void speedUp() {
		speed++;
		System.out.println(speed+"속도를 올렸다.");
	}
	
	void print() {
		System.out.println("색깔:"+color);
		System.out.println("속도:"+speed);
	}

}
