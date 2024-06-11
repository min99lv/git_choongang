package ch08_ex01;
//hw02 - interface구현
public interface Ex07Volume {
	void Volumeup();
	void VolumeDown();

}

class Tv implements Ex07Volume{

	@Override
	public void Volumeup() {
		System.out.println("TV Volume 올리기");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("TV Volume 내리기");
		
		
	}
		public void play() {
		System.out.println("Tv화면을 본다");
	}
	
	
}
class Audio implements Ex07Volume{

	@Override
	public void Volumeup() {
		System.out.println("Audio Volume 올리기");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("Audio Volume 내리기");
		
	}
	
}
class Speaker implements Ex07Volume{

	@Override
	public void Volumeup() {
		System.out.println("Speaker Volume 올리기");
		
	}

	@Override
	public void VolumeDown() {
		
		System.out.println("Speaker Volume 내리기");
	}
	
	
}
