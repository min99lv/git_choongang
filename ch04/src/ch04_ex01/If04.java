package ch04_ex01;
//hw1
//0524완
public class If04 {				//	중첩 if문 --> 점수를 입력하면 등급을 알려주는 예제

	public static void main(String[] args) {
		int score = Integer.parseInt(args [0]);
				String grade = " ";
				
				if (score	>= 90	) 	
				{
							if (score >= 97)	
							{
										grade	=	"A+";
							} else if (score < 94)	
							{				
										grade	=	"A-";
							} else 
										grade	=	"A0";				
				} 	else if (score	>= 80	)	{
							if (score >= 87)	{
										grade	=	"B+";
							} else if (score < 84)	{		
										grade	=	"B-";
							} else 
										grade	=	"B0"; 
				} else if (score	>= 70	)	{					
							if (score >= 77)	{
										grade	=	"C+";
							} else if (score < 74)	{				
										grade	=	"C-";
							} else 
										grade	=	"C0";			
				} else if (score	>= 60	)	{				
							if (score >= 67)	{
										grade	=	"D+";
							} else if (score < 64)	{			
										grade	=	"D-";
							} else 
										grade	=	"D0";
				}	else
										grade	=	"F";
			
	        System.out.println("점수는"+score+"이고"+"학점은"+grade);
				
		
	}
	

}
