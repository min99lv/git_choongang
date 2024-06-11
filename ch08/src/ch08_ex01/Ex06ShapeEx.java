package ch08_ex01;

//0530 - hw02
// 형변환과 
public class Ex06ShapeEx {

	public static void main(String[] args) {
		// Instance 객체 생성이 안된다 -> abstract class 이기 때문에
		Ex06Shape[] sh = new Ex06Shape[3];
		sh[0] = new Triangle();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		for (Ex06Shape s : sh) {
			s.print();
			s.draw();
			// 객체가 rectagle 일때만 객체 사용
			if (s instanceof Rectangle) {
				// 형변환
				((Rectangle) s).display();
			}
		}

	}

}

//console
//------선과 점으로 구성됐다.-------
//삼..각형을 그린다
//------선과 점으로 구성됐다.-------
//사각형을 그린다
//Rectangle 사각형 Display을 그린다
//------선과 점으로 구성됐다.-------
//원...을 그린다