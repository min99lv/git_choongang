package ch08_ex06;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle 에서 DB 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle 에서 DB 삽입");

	}

	@Override
	public void ubdate() {
		System.out.println("Oracle 에서 DB 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracle 에서 DB 삭제");

	}

}
