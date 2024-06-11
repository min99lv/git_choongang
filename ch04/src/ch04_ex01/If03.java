
package ch04_ex01;
// hw - 0523 완료
public class If03 {

	public static void main(String[] args) {
		//1. If03 수행 시 파라메타를 하나받음 (점수)
		//	int score = 0;
		// 2. score 가지고 if문 수행
		// 			1) 90 >= x   grade = "A"
		//			2) 80 <= x < 90 grade = "B"
		//			3) 70 <= x < 80 grade = "C"
		//			4) else grade = "F"
		
		int score = Integer.parseInt(args[0]);
		String grade;
		
		if ( score >= 90)	{
			grade = "A";
		}  else if (score	>=	80 ) {
			grade = "B";
		} else if  (score	>=	70 ) {
			grade =	"C";
		} else {
			grade = "F";
			}
		System.out.printf("당신 점수는 %d 이고 학점은 %s 입니다",score,grade);

// 			선생님 코드
		
//			if (score>=90) grade= "A";
//			else if (score >=80) 	grade = "b";
//			else if (score >=70) 	grade = "C";
//			else									grade = "권총";
//			System.out.println("당신 점수는"+score+"이고"+"학점은"+grade+"입니다");
			
		}
	}



