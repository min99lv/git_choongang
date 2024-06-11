package ex0531.ch08_ex04;

public class HanKookTire extends Tire {

	public HanKookTire(String location, int maxRotaiton) {
		super(location, maxRotaiton);

	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HoonKookTire" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HoonKookTire펑크***");
			return false;
		}

	}

}
