package javapro.classEx;

public class AccountEx01 {

	public static void main(String[] args) {
		Account geonsang = new Account(); //geonsang 인스턴트 객체 생성
		Account sanglee = new Account();
		geonsang.accountNo = "111-222-333333"; // 건상 통장 계좌번호
		geonsang.ownerName = "이건상"; // 건상통장 예금주
		geonsang.balance = 0; //건상 통장 만듬. 잔액 0 
		geonsang.deposit(3000); // 건상 통장에 3000원입금.
		geonsang.deposit(5000); // 건상 통장에 5000원입금.
		geonsang.withdraw(2000); //건상 통장에서 2000원 출금.
		System.out.println("계좌번호 : " + geonsang.accountNo);
		System.out.println("예금주 : " + geonsang.ownerName);
		System.out.println("잔액 : " + geonsang.balance);
	}

}
