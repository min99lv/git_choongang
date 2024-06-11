package ch04_ex02;
//hw03 - if or switch문 사용
import java.io.IOException;

public class WhileKeyControlEx2 {

	public static void main(String[] args) throws IOException {
					boolean		run	 			= true;
					int 					speed	 	= 0;
					int 					keyCode	= 0;
					
					while(run) 	{
						if (keyCode !=	13	&&	keyCode	!=	10)				
						{
							System.out.println("- - - - - - - - - - - - - - - - ");
							System.out.println("1.증속 | 2. 감속| 3.중지");
							System.out.println("- - - - - - - - - - - - - - - - ");
							System.out.print("선택:");
						}
						
						keyCode = System.in.read(); 	
						
						//System.out.println("keyCode->"+keyCode);
						
						switch (keyCode) {	
						case 49:
							speed ++;
							System.out.println(speed);
							break;
						case 50:
							speed --;
							System.out.println(speed);
							break;
						case 51:
							run = false;									
							System.out.println("pm the end");
						}
					
					}
	
		}
}
	/*
					if(keyCode == 49) {
						speed ++;
					} else if (keyCode == 50) {
						speed --;
					} else if (keyCode == 51) {
						run = false;
					}
	*/