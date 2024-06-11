package ch07_ex02;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student();
//		st1.setName("수지");
		st1.setAge(21);
		st1.setSno("1111");
		st1.name = "수지";  //-> 에러 프라이빗을 권장하는 이유 비즈니스룰이 정해져있을때 게터와 세터를 사용한다
//		st1.sno = 100; // --> 비즈니스룰 위반 -> 이것을 사용하려면 public
		
		Teacher th1 = new Teacher();
		th1.setName("길동");
		th1.setAge(35);
		th1.setSubject("java");
		
		Manager mg1 = new Manager();
		mg1.setName("원빈");
		mg1.setAge(19);
		mg1.setPart("청소");

		System.out.println("이름:"+st1.getName()+"나이" + st1.getAge() +"학번:"+ st1.getSno());
		th1.printAll();
		mg1.printAll();
	}

}

