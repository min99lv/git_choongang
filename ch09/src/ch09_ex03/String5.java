package ch09_ex03;
// 원래 이름과 확장자명을 분리하는 법 예제
// ** 리뷰대상
public class String5 {

	public static void main(String[] args) {
//						index:		 012345(.)6
		String fullName = "Hello.java";
		int index = fullName.indexOf('.'); // .의 대한 index를 나오게 하는 메소드
		System.out.println("index->" + index);
		String fileName = fullName.substring(0, index); // 0부터 5미만

		String ext = fullName.substring(index + 1); // 6부터 끝까지
		System.out.println(fullName + "의 확장자를 제외한 이름은" + fileName);
		System.out.println(fullName + "의 확장자는" + ext);

	}

}

// console
// index->5
// Hello.java의 확장자를 제외한 이름은Hello
// Hello.java의 확장자는java