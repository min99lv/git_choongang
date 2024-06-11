package ch12_ex03;

// Thread 생성
class Account2User extends Thread {
	Account2 act; // 연관관계
	boolean flag; 

	public Account2User(Account2 act, String name) {
		super(name);
		this.act = act;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 동기화 내가 act를 사용하는 동안에는 다른 사람은 건들이지 못한다.
			synchronized (act) {
				if (flag) // boolean의 초기값은 false
					act.deposit((int) (Math.random() * 10000), getName());
				else
					act.withdraw((int) (Math.random() * 10000), getName());
				flag = !flag; // flag SWAP  순서를 바꿔준다
			}
		}
	}
}

public class Account2Ex {

	public static void main(String[] args) {
//		Girl Group 반드시 Account2 만들어줘야함
		Account2 act1 = new Account2(10000);
//		Boy Group
		Account2 act2 = new Account2(15000);
//																						하나의 계좌 공동사용 = call by reference
		Account2User au1 = new Account2User(act1, "하니");
		Account2User au2 = new Account2User(act1, "민지");
		Account2User au3 = new Account2User(act1, "혜린");
//																						하나의 계좌 공동사용
		Account2User au4 = new Account2User(act2, "정국");
		Account2User au5 = new Account2User(act2, "뷔");
		Account2User au6 = new Account2User(act2, "지민");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();

	}

}
