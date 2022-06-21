
public class Accounts {

	private int acntNo;
	private String holder;
	protected double balance;
	private static int count=111;
	public Accounts() {
		
	}
	
	public Accounts(String holder, double balance) {
		super();
		this.acntNo = count++;
		this.holder = holder;
		this.balance = balance;
		
	}
	
	public void summary() {
		System.out.println("A/C No: "+acntNo);
		System.out.println("Holdler: "+holder);
		System.out.println("Balance:" +balance);
	}
	//Business Logic methods
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			
		}else {
			System.out.println("Insufficient balance!");
		}
	}
	public void deposit(double amount) {
		balance += amount;
	}
	

}
