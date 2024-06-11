package ch04_ex02;
//0523완
public class IfNestedEx {				// 중첩 if문 예제

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81; //20보다 큰 수는 나오지 않는다 
		System.out.println("점수"+score);
		
		String grade;
		
		if(score>=90) {							//score가 90점 이상이면 밑줄 실행
			if (score>=95) {						// 그 중에서도 score가 95점 이상이면 A+
			grade = "A+";
			}		else	 		 {											// score가 90점 이상이지만 95점 미만이면 A
						grade = "A";
			}
		} else					 {
				if (score >= 85) {
				grade= "B+";
			}  else 					   {
				grade = "B";
			}
		}
			System.out.println("학점:"	+	grade);
	}

}
