package ch08_ex06;

public class DaoEx {
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.ubdate();
		dao.delete();
	}
	public static void main(String[] args) {
//		DataAccessObject odao1 = new OracleDao(); 메모리는 오라클다오
//		dbwork(odao1);
		
//		위에 줄을 축약한 것 
		dbwork(new OracleDao());
		dbwork(new MysqlDao());

	}

}
