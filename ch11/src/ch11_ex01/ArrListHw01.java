package ch11_ex01;

//	240605 hw-1
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListHw01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/jsp");
		list.add("iBATIS");
//		list.add(2,"Databse");
		

		int size = list.size();
		System.out.println("총 객체수 :" + size);
		System.out.println("List: " + list);

//		2번째 인덱스 가져와서 출력
		System.out.println("2->" + list.get(2));

//		Database, Servlet.Jsp, iBatIS 삭제
//		for문이용 남은 원소 조회

//		list.remove(2);
		list.remove("Servlet/jsp");
		list.remove("iBATIS");
		list.remove("Database");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}

	}

}

//console
//총 객체수 :5
//List: [Java, JDBC, Database, Servlet/jsp, iBATIS]
//2->Database
//0:Java
//1:JDBC
