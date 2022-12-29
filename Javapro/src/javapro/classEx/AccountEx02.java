package javapro.classEx;

public class AccountEx02 {

	public static void main(String[] args) {
		                  //new 생성자(  ) 값을 초기에 저장해놓는것.
		Account geonsang = new Account("111-222-33333", "이건상" , 1000); 
		Account leegeon = new Account("111-333-444444", "리건", 0);
		geonsang.deposit(6000);
		leegeon.deposit(10000);
		try {
		geonsang.withdraw(20000);
		printAccount(geonsang);
		printAccount(leegeon);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		

	//예금정보 출력 메서드
	public static void printAccount(Account obj) {
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("----------------------------");
	}
	
}
