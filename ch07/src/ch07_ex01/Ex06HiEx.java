package ch07_ex01;
//hw01 - 재귀함수를 이용해서 푸는 예제 ex05참고
//0529완
class D1 {
		

		void hi (int cnt) {
			if (cnt >= 0) {			//조건
				System.out.println("안녕, 나야 !! cnt-->"+cnt);		// cnt값 출력
				hi(--cnt);																			// 자기자신을 다시 호출해서 반복시킨다
				
	
			}
		}
}


public class Ex06HiEx {

	public static void main(String[] args) {
			D1 d = new D1(); 	//   인스턴스
			d.hi(6);						// 	hi메소드에 6입력
	}

}


// if (cnt < 1) return;

// 결과
//안녕, 나야 !!   cnt-->6
//안녕, 나야 !!   cnt-->5
//안녕, 나야 !!   cnt-->4
//안녕, 나야 !!   cnt-->3
//안녕, 나야 !!   cnt-->2
//안녕, 나야 !!   cnt-->1
//안녕, 나야 !!   cnt-->0