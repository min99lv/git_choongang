package ch08_ex06;

// 인터페이스를 상속 받았기 때문에 반드시 구현해야함
public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에서 삽입");

	}

	@Override
	public void ubdate() {
		System.out.println("Mysql DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");

	}

}
