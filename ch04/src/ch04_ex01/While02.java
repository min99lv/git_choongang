package ch04_ex01;

import java.io.IOException;

public class While02 {								
																				//System.in.read();
																				//만약 에러가 나오면 내가 시스템에서 던져줄게
	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
										// 		ASCII CODE 
										//		53 - 	 48 = 5 
										//      57 -      48 = 9				//어떤 값에서 '0'를 빼면 원래 숫자가 나온다
		int num = System.in.read() - '0';					//	input값		-> arguments도 귀찮다 //1byte만 입력가능
		//	System.out.println("num->"+num);			// 9를 입력했더니 아스키값으로 나온다 //
		int i = 1;
		
		if (num >= 2 && num <= 20)			 // num 값을 입력 
		{
					while (i	<=	9) 						// i = 1 부터 시작 9까지 반복 10에서 종료
					{
						System.out.println(num	+	" * "	+	i	+	"="	+	num	*	i);	
						i++;
					}
		}
		else 
		{
			System.out.println("구구단에 없는 숫자입니다");
		}
		

	}

}
