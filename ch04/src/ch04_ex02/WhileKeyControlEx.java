package ch04_ex02;
//hw03 - if or switch문 사용
import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
					boolean		run	 			= true;
					int 					speed	 	= 0;
					int 					keyCode	=  0;
					
					while(run) 		//	 무한루프 설정	
					{
						if (keyCode	!=	13	&&	keyCode	!=	10)				// if코드를 넣지 않으면 엔터 + 숫자도 같이 입력되기때문에 설정
						{
							System.out.println("- - - - - - - - - - - - - - - - ");
							System.out.println("1.증속 | 2. 감속| 3.중지");
							System.out.println("- - - - - - - - - - - - - - - - ");
							System.out.print("선택:");
						}
						keyCode = System.in.read(); 	
																						// 콘솔상에 값이 입력되기를 기다리고 있는 상태
																						// 엔터값+ 숫자
																						
																						//	 Carrige return (13) +Lime feed(10) = 엔터키
																						// 	줄바꿈
						
						System.out.println("keyCode"+keyCode);	//아스키코드 값으로 나온다.
//						선택: 1
//						keyCode->49
//			          결과 	1) speed + 1
//						    2) 보여줘	[ 현재 속도=" + speed ]
//						2
//						keyCode->50
//			          결과 1) speed - 1		
//					        2) 보여줘	[ 현재 속도=" + speed ]

//						3
//						keyCode->51
//			          결과  run = false
//			               Escape
						switch (keyCode) {
						case 1:
							speed=+1;
							break;
						case 2:
							speed=-1;
							break;
						case 3:
							System.out.println(run = false);
						}
						System.out.println();
					}
					System.out.println("pm the end");
					

	}

}
