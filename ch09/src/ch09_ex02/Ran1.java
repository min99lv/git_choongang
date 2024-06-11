package ch09_ex02;

import java.util.Random;

public class Ran1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("100이하 정수" + ran.nextInt(101));
		System.out.println("랜덤정수" + ran.nextInt());
		System.out.println("double" + ran.nextDouble());
		System.out.println("float" + ran.nextFloat());
		System.out.println("long" + ran.nextLong());
	}
}

//console
//100이하 정수15
//랜덤정수-564010604
//double0.27884858723589157
//float0.9241455
//long4344020618697056133