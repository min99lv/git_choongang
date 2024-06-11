package ch03_ex01;
//0523완
public class Ex07ConditionalOpertionEx { 	// 삼항 연산자 예제

	public static void main(String[] args) {
		int score = 85;
		//	  score가 90점보다 크면 A 아니면 (스코어가 80보다 크면) B 아니면 C
		char grade = (score> 90) ? 'A':((score > 80) ? 'B':'C');
				System.out.println(score + "점은" +  grade +"등급입니다.");
	}

}
