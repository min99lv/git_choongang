package ex0531.ch08_ex04;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotaiton) {
		super(location, maxRotaiton);

	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire펑크***");
			return false;
		}
	}

}
