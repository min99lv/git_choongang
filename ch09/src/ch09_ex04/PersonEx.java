package ch09_ex04;
// 0603 hw02완 
public class PersonEx {
//	문제 : 학번만 같으면 같다 출력
	public static void main(String[] args) {
		Person p1 = new Person(1111, "광해");
		Person p2 = new Person(1111,"광해군");
		
//		내코드  -> 틀림
//		if ( p1.id == p2.id)  		System.out.println("같다");
//		else 								System.out.println("다르다");
		if ( p1.equals(p2))  		System.out.println("같다");
		else 								System.out.println("다르다");


	}

}


