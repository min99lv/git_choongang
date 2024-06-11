package ch02_ex02;
//Study
//0523
public class ConcatEx {	// 다항연산자에서 문자열 연산식 순서에 대한 예제

	public static void main(String[] args) {
		String str1 = "num"+3+4;  						//	num이 문자열이기 때문에 3,4도 문자열로서 더해진다
		String str2 = 3 + 4 + "=num"; 					//	숫자로 인식하고 먼저 더하기때문에 7+문자열이 된다
		System.out.println("str1->"+str1); 	//str1->num34
		System.out.println("str2->"+str2); 	//str2->7=num

	}

}

//	 String에서 문자열을 더할 때는 처음에 더하는 것이 숫자이면 숫자로 인식하다가 
//	그 다음에 더해지는 것이 문자면 숫자 + 문자열