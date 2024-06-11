package ch07_ex01;
//0529 캡슐화에 대한 예제
//0529완

class Encapsule {
	private String name; // --> 정보보호를 위해서 캡슐화
	private int age;
//		public String name;
//		public int age;

	public String getName() {		// 이름을 가져온다
		return name;
	}

	public int getAge() {		// 나이를 가져온다
		return age;
	}

	public void setname(String name) {	// 이름을 저장한다
		this.name = name;
	}

	public void setAge(int age) {	// 나이를 저장한다.
		if (age < 0)
			System.out.println("나이 입력 오류 ㅎㅎ");
		else
			this.age = age;
	}
}

public class Ex02EncapsuleEx {

	public static void main(String[] args) {
		Encapsule h1 = new Encapsule();
//			h1.name = "김준수";		--> 퍼블릭인 경우에 사용 가능
//			h1.age = -10;					--> 프라이빗이랑 다른 클래스라서 

		h1.setname("김준수");
		h1.setAge(-10);

		System.out.println("이름 :" + h1.getName());
		System.out.println("나이 :" + h1.getAge());

	}

}




//console
//나이 입력 오류 ㅎㅎ
//이름 :김준수
//나이 :0 --> int null값이 = 0 이기때문에 0으로 출력된다






