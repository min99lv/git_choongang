package ch06_ex01;
//hw02

class Account {
	String account;
	String name;
	int balance; 
	
	public Account(String acc, String n, int bal) {
			account = acc;
			name = n;
			balance = bal;
	}
	//예금
	void deposit (int amt)	{
		balance += amt;
		System.out.println(name+"이"+amt+"가 예금...");
	}
	//인출
	void withdraw(int amt) {
		if (balance < amt) {
			System.out.println(name+ "이 " +amt+"가 출금시도.");
			System.out.println(name + "잔고부족");
		}
		else {
			balance -= amt;
			System.out.println(name+"이"+amt+"가 출금...");
		}
	}
	// 계좌 잔액 조회
	void preBalance () {
		System.out.println(name +"현재 잔액은"+balance);
	}
}

public class AccountEx {

	public static void main(String[] args) {
				// Account Instance ac1, ac2 생성
				// ac1 -> 신한1, 이성계, 1500
				// ac2 -> 국민 2, 강감찬,7000
		
		
		Account ac1 = new Account("신한1", "이성계", 1500);
		Account ac2 = new Account ("국민2", "강감찬", 7000);
		
		ac1.deposit(3000);
		ac1.withdraw(5000);
		ac1.preBalance();
		ac2.deposit(5000);
		ac2.withdraw(7000);
		ac2.preBalance();
		
		

	}

}





// 결과
//이성계이 3000가 예금...
//이성계이 5000가 출금시도.
//이성계 잔고 부족  
//이성계  현재 잔액은 4500
//강감찬이 5000가 예금...
//강감찬이 7000 출금...
//강감찬  현재 잔액은 5000