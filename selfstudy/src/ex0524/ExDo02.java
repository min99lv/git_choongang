package ex0524;

public class ExDo02 {	//do while중첩문을 이용해서 구구단을 출력하는 문제

	public static void main(String[] args) {
				int i = 1,  j = 2;
			
				do {
						do {
							System.out.print(j+"*"+i+"="+j*i+"\t");
							j++;
				}	while(j<=9);
				System.out.println();
				i++;
				j=2;
				
			}while(i<=9);
		
	}

}
