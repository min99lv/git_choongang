package ex0531;

public class Engine {
//	멤버변수 선언
	String type;		//	"알파엔진", "베타엔진"
	int cc;				//	2000, 3000

//	생성자
	Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}

//	일반 Method
	void print() {
		System.out.println("타입 :" + type);
		System.out.println("배기량:" + cc);
	}

}
