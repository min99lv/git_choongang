package ch02_ex01;
//0522완
public class VariableScopeEx {				//	local변수(지역변수)범위 예제
	
	public static void main(String[] args) {
		int var1=15;		//	var1 main메소드 블록에서 선언
		if(true) {				//	if(true)는 무조건 실행
			int	var2;			//	var2 if문 블록안에서 선언 if문 안에서만 사용 가능
			var1	=	10;		
			var2	=	20;
			System.out.println("var1	->	"	+	var1);
			System.out.println("var2	->	"	+	var2);			
		}
		System.out.println("var1	->"	+	var1);
		// System.out.println("var2->"+var2);			--> 컴파일 에러 var2변수는 if문 block안에서만 사용가능하다
	}

}
