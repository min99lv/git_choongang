package ch07_ex01;
//0529 - call by Value & Call by Reference에 대한 예제
//0529완

// Call by Value && call by Reference --> ***
// 기본 자료형을 넘겨주느냐 객체 주소를 넘겨주느냐
class Data {
    int kor;            // 필드 생성
    int eng;
    int math;

    // void : 리턴타입을 주지 않겠다는 의미 -> 알아서 하겠다 리턴값을 주지않겠다
    // call by reference
    void addRef(Data d1, Data d2) {        // 메소드
        d1.kor = d2.eng;
        System.out.println("mehod국어점수 :" + d1.kor);
    }

    // Return type = int  Return method명 parameter = addKor (int Kor)
    //  call by value
    int addKor(int kor) {
        kor += 10;
        System.out.println("Kor=>" + kor);
        return kor;
    }
}

public class Ex01DataEx {

	public static void main(String[] args) {
		// 확보 공간의 주소를 가지고 있다.
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
//		int d3_kor = d3.addKor(10);    // 메소드를 실행시킨 결과를 d3_kor로 받는다 리턴타입이 int기 때문에 앞에 int를 써준다.
//		System.out.println("d3_kor->"+d3_kor); // 로직안으로 디버그 
		d1.kor 		= 50;
		d1.math 	= 70;
		d2.eng		= 80;
		// *** instance를 넘겨주면  메모리 주소번지 = 주소값을 넘겨주는 효과
		// call by reference
		d3.addRef(d1, d2);	
		System.out.println("main 국어 점수:" +  d1.kor);
		
		// call by value
		int d3_kor = d3.addKor(10);
		System.out.println("main 국어 점수:" +  d3_kor); // 리턴값
		System.out.println("main 국어 점수:" +  d3.kor); // 메소드 호출
	}

    // Call by Value && Call by Reference ---> ***
    // 기본자료형값을 넘겨주느냐 객체주소를 넘겨주느냐

}

// d3.addKor(10); -> 메소드 int kor로 들어온다 -> 20 -> D3_kor값으로 반환 출력값 -> 20  // 자료형을 맞춰주어야한다
// 주소값을 넘겨와서 void면 상관없다.
// Call By Value는 자료형 하나밖에 못 리턴한다 void 는 아예 못가져온다.



//console
//mehod국어점수 :80
//main 국어 점수:80