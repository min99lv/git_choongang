package ch09_ex04;

public class Person {
	int id;
	String name;

	//hw01
	public Person (int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		Person p = null;
		if (obj instanceof Person) p = (Person) obj;
		if (obj != null && this.id == p.id) b= true;
		
		return b;
	}
	
	

}
