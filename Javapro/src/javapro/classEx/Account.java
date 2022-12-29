package javapro.classEx;

//은행계좌 클래스
public class Account {
	// 필드
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance; // 잔액

	// 생성자
	public Account(String accountNo, String ownerName, int balance) {
		this(accountNo, ownerName); //this( ) = 생성자에서 다른 생성자호출 (괄호 안에 매개변수를 다른 생성자로 보낸다.)
		this.balance = balance;
	}
	
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}

	// 매개변수가 없는 생성자를 default 생성자라고한다.
	// 생성자가 없는 클래스는 컴파일 과정에서 default 생성자가 자동으로 생성된다.
	// 생성자가 있는 클래스에 매개변수가 없는 것도 사용하고 싶다면 default 생성자를 넣어놔야 사용할 수 있다.
	public Account() {

	}

	// 예금한다 메서드
	void deposit(int amount) { //return 값이 없으면 void
		balance += amount;
	}

	// 인출한다 메서드
	int withdraw(int amount) throws Exception { //return 값이 있으면 타입
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
}
