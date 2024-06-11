package ch08_ex01;

public class Ex07VolumeEx {
	public static void main(String[] args) {
		Ex07Volume[]  vol = new Ex07Volume[3];
		vol[0] = new Tv();
		vol[1] = new Speaker();
		vol[2] = new Audio();
		
		for (Ex07Volume v : vol) {
			v.Volumeup();
			v.VolumeDown();
			if(v instanceof Tv) {
				((Tv)v).play();
			}

		}
	}

}

//console
//TV Volume 올리기
//TV Volume 내리기
//TV 화면을 본다
//Speaker Volume 올리기
//Speaker Volume 내리기
//Audio Volume 올리기
//Audio Volume 내리기