package ex0530;

public class Volume1Ex {
	public static void main(String[] args) {
		Volume1[] vol = new Volume1[3];
		vol[0] = new Tv();
		vol[1] = new Speaker();
		vol[2] = new Audio();
		
		for (Volume1 v : vol) {
			v.Volumeup();
			v.VolumeDown();
			if( v instanceof Tv) {
				((Tv)v).play();
			}
		}
	}

}
