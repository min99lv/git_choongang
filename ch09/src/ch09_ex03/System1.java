package ch09_ex03;
// .getenv 환경변수를 검색해서 가져오는 메소드
public class System1 {

	public static void main(String[] args) {
//								 시스템에 있는 환경변수를 가져와라
		String path = System.getenv("path"); 
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(path);
		System.out.println(java_home);;

	}

}

// console
// C:\Program Files\Common Files\Oracle\Java\javapath;
// C:\WINDOWS\system32;C:\WINDOWS;
// C:\WINDOWS\System32\Wbem;
// C:\WINDOWS\System32\WindowsPowerShell\v1.0\;
// C:\WINDOWS\System32\OpenSSH\;
// C:\Program Files\Java\jdk-17\bin\;
// C:\Java Programming\repo5\Git\cmd;
// C:\Users\admin\AppData\Local\Microsoft\WindowsApps;
// C:\Program Files\Java\jdk-17