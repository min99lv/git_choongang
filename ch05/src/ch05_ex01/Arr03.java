package ch05_ex01;
//현장 work
//0528완, 0530완
public class Arr03 {		// Arr02에서 배운 향상형 for문을 배열을 사용하여 만드는 예제

	public static void main(String[] args) {
			String [ ] str = {"산토끼", "고양이", "판토끼", "강아지"};
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println("=====향상형 for문(실무)=====");
			for (String kk :  str) {								// 선언한 배열과 자료형을 같게 하는 것 잊지않기
				System.out.println("kk->" + kk);
			}

	}

}
