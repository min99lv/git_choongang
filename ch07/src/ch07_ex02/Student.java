package ch07_ex02;

public class Student {
	public String name;  //encapsulation
	private int age;			// 0~100
	private String sno;		// 비즈니스룰 가정10000~99999

	public void printAll() {
		System.out.println("이름" + name + "나이" + age + "학번" + sno);
	}
	// getter 읽을때
	public String getName() {
		return name;
	}
	// setter 저장할때
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
//		if (sno > "10000" && sno < 99999) 비즈니스룰 설정 
		this.sno = sno;
//		else  
	}

}
