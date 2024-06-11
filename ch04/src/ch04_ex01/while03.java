package ch04_ex01;

public class while03 {						// 중첩 while문으로 구구단을 만드는 예제 

	public static void main(String[] args) {
					int i = 1, j = 2 ;
					System.out.println("	구구단	");
					while (i	<=	9)
					{
								while(j	<=	9)
								{
									System.out.print(	j	+	" * "	+	i	+	" = "	+	i	*	j	+	" \t ");
									j++;
								}
						System.out.println( );
						j	=	2;
						i++;
					}

	}

}
