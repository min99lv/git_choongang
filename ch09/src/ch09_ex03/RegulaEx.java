package ch09_ex03;
// 정규식 예제
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus"
										, "cA", "ca", "co", "c."
										, "cafe12"
										, "c0", "car", "combat", "count"
										, "date","disc" };
//																c다음 문자 abc순서 *: 반복할 수 있다
		Pattern p = Pattern.compile("c[a-zA-z]*");
//		c로 시작하는 소문자 영단어
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {
				System.out.print(data[i] + ",");
			}
		}

	}

}

// console
// ca,co,car,combat,count,


//c[a-zA-Z]+\d*