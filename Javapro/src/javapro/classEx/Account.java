package javapro.classEx;

//은행계좌(통장)클래스
public class Account {
	// 필드 (객체 데이터가 저장되는 곳)
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance; // 잔액

	// 예금한다는 메서드
	void deposit(int amount) {
		balance += amount;
	}

	// 인출한다는 메서드
	void withdraw(int amount) {
		balance -= amount;
	}
}
