package ch06_ex01;
//hw01

class Person	{
	String name;
	int age;
	String gender;
	void print()	{
		System.out.println("이름:"+name+"나이:"+age+"성별:"+gender);
	}
	
}

public class PersonEx {

	public static void main(String[] args) {
			 // Instance per 11, per 12, per13
		
		Person per11 = new Person();
		Person per12 = new Person();
		Person per13 = new Person();
		
		per11.name="홍길동";
		per11.age=52;
		per11.gender="M";
		per11.print();
		
		per12.name="연개소문";
		per12.age=62;
		per12.gender="M";
		per12.print();
		
		per13.name="선덕여왕";
		per13.age=72;
		per13.gender="F";
		per13.print();
	
	}

}




// 결과
//이름:홍  길동 나이 :52 성별 :M
//이름:연개소문 나이 :62 성별 :M
//이름:선덕여왕 나이 :72 성별 :F