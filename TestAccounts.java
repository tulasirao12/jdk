
public class TestAccounts {

	public static void main(String[] args) {
	/*	Accounts a1 = new Accounts("Sam",4000);
		a1.summary();
		
		a1.deposit(2000);
		a1.summary();
		
		a1.withdraw(3000);
		a1.summary();
		
		a1.withdraw(5000);*/
		
		/*Savings s1 = new Savings("keis");
		s1.summary();
		s1.withdraw(1000);
		s1.deposit(2000);
		s1.summary();
		s1.withdraw(1000);
		s1.summary();*/
		
		Current c1 = new Current("mohan");
		c1.summary();
		c1.withdraw(8000);
		c1.summary();
		c1.withdraw(7000);
		c1.summary();
		c1.withdraw(1000);
		c1.summary();
		c1.deposit(3000);
		c1.summary();
	}

}
