package ch03_ex02;
//0523완
public class ex0202 {			// 삼항 연산자 연습문제

	public static void main(String[] args) {
		int score = 85;																// 크다의 반대 작고 같다 
		String result = (	!(score>90)	)	?	"가" : "나"; 		// score가90보다 크지 않으면 참이므로 "가" 출력
		System.out.println(result);

	}

}
