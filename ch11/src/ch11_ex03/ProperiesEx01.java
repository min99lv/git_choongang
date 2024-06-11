package ch11_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

//**
public class ProperiesEx01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Properties선언 = pt
		Properties pt = new Properties();
//																			.getResource 리소스를 가져오고 싶을때, 		url경로를 문자열로 반환
		String path = ProperiesEx01.class.getResource("database.propertise").getPath();
//		1. 문자열로 반환받은 url 출력
		System.out.println("1 path : " + path);
//										%20 = space bar
//						디코드를 하면 특수코드를 처리해줌
		path = URLDecoder.decode(path,"utf-8"); // import
		System.out.println("2 path : " + path);
//		로드를 하면 메모리로 올라간다.
		pt.load(new FileReader(path)); 
//		파일로 만들어놓은 값을 키 value로 해서 가져올 수 있다
		String driver = pt.getProperty("driver");
		String url = pt.getProperty("url");
		String username = pt.getProperty("username");
		String password = pt.getProperty("password");
		
		System.out.println("2. path:"+path);
		System.out.println("드라이버 : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
	}
}
