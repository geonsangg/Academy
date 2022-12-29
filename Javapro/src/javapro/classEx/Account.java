package javapro.classEx;

//은행계좌 클래스
public class Account {
	// 필드
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance; // 잔액
	
	//생성자
	public Account(String accNo, String oName, int bal) {
		accountNo = accNo;
		ownerName = oName;
		balance = bal;
	}
	

	// 예금한다 메서드
	void deposit(int amount) {
		balance += amount;
	}

	// 인출한다 메서드
	int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
