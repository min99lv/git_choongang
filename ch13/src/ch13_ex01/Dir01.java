package ch13_ex01;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
//		File file = new File("."); // 현재 실행폴더 목록 
//		File file = new File("src/ch13_ex01"); // 원하는 폴더 안에있는 파일 목록 
		File file = new File("../ch12"); // 다른폴더로 가기위해서 상위폴더 이동 후 12장으로 이동  

		String[] list = file.list(); // 제네릭이 아니고 배열이라 해쉬코드를 보여줌
		System.out.println("list->" + list);
		for(String str : list) {
			System.out.println(str); // ch13 폴더 목록 출력
		}
		

	}

}
