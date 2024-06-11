package ex0530;

public interface Volume1 {
		void Volumeup();
		void VolumeDown();

}

class Tv implements Volume1{

	@Override
	public void Volumeup() {
		System.out.println("티비 볼륨 올리기");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("티비 볼륨 내리기");
	
	}
	void play() {
			System.out.println("티비 화면 보기");	
	}
	
}

class Audio implements Volume1{

	@Override
	public void Volumeup() {
		System.out.println("오디오 볼륨 올리기");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("오디오 볼륨 내리기");
		
	}
	
}

class Speaker implements Volume1{

	@Override
	public void Volumeup() {
		System.out.println("스피커 볼륨 올리기");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("스피커 볼륨 내리기");
		
	}
	
}
