package ch11_ex01;

import java.util.ArrayList;

public class CarEx01 {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		
//		list안에 객체 저장
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		
		for(Car c : al) {
			c.print();
			if(c instanceof Bus) {
//				((Bus)c).move();
				Bus b = (Bus)c ;
						b.move();
			}
		}
		
		

	}

}
