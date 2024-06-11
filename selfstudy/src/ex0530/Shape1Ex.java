package ex0530;

public class Shape1Ex {

	public static void main(String[] args) {
		// instance 안됨 (객체 생성이 안됨) --> abstract class
		Shape1[] sh = new Shape1[3];
		sh[0] = new Triangle();
		sh[1] = new Rectagle();
		sh[2] = new Circle();
		
		for (Shape1 s : sh) {
			s.print();
			s.draw();
			if (s instanceof Rectagle) {
				((Rectagle)s).display();
			}
		}
	}

}
