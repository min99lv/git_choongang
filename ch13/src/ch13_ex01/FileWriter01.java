package ch13_ex01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명"); 
		String fileName = sc.nextLine(); // 만들 파일 이름
		System.out.println("저장할 글을 입력하시오");
		String msg = sc.nextLine(); // 저장글
//		FileWriter fw = new FileWriter(fileName);
		FileWriter fw = new FileWriter("src/ch13_ex01"+fileName); // 저장폴더 지정
		Date date = new Date();
		fw.write(date+" : "+msg); // 오늘의 날짜 + msg
		fw.close(); // 반드시 해야함
		System.out.println("출력끝");
		sc.close();
	}

}

//console
//출력할 파일명
//abc.txt
//저장할 글을 입력하시오
//aaakkkk
//출력끝

