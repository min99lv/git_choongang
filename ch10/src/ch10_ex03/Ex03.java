package ch10_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
//		파일을 읽어주는 클래스 =   FileReader
		FileReader reader;	
		char[] buffer = new char[100];		// 100byte
		String file_name = ".classpath"; //  ".classpathKKK";예외
//		예외
//		try catch로 감쌌을때도 오류가 나서 이중 트라이캐치가 되면 복잡해지고
//		오류가 날 수 있기때문에 한개의 트-캐로 만들어준다
		try { 					// 패키지 10에서 파일이름을 읽는다
			reader = new FileReader(file_name);
			reader.read(buffer, 0, 90); // 100byte읽어서 reader안에 넣어놓겠다 = call By reference
			String str = new String(buffer);
			System.out.println("읽은건 " + str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없슴당");
		} catch (IOException e) {
			System.out.println("읽다가 에러낫슈");
		} finally {
			System.out.println("어쨌거나 읽었어요");
		}

	}

}
