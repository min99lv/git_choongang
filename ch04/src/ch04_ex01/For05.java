package ch04_ex01;

public class For05 {			// 중첩 for문을 이용해서 만든 예제

	public static void main(String[] args) {
				for	(int	i	=	0; i	<=	4; i++)	 {					
						for	(int j	=	0; j	<= i;	 j++) {
								System.out.print("*");;
						}
						System.out.println();
				}
				for (int i  =  4;	i >=	0; i--) {
						for (int j	 =	 0;	j	<=	i;	j++) {
								System.out.print("*");;
						}
						System.out.println();
				}
	}

}
