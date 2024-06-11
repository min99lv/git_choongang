package ex0528;

class Account2{
	String account;
	String name;
	int balance;

	public Account2(String acc, String n, int bal) {
			account = acc;
			name = n;
			balance = bal;
	}
	
	void desposit (int amt) {
		balance += amt;
		System.out.println(name+"이"+amt+"가 예금...");
	}
	
	void withdraw(int amt) {
		if (balance < amt) {
			System.out.println(name);
		}
	}
	
}


public class AccountEx2 {

	public static void main(String[] args) {
		
	}

}
