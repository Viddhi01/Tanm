public class account
{
	

	
	int acc_num;
	String name;
	double balance;
	String email = "Tanmay shinde";
	

	static final double max_salary;
	static final double min_salary = 15000;
	static{
		max_salary = 25000;
	}
	
	static void print_sal()
	{
		System.out.println(max_salary);
	}	
	
	void withdraw(int amt)
	{
		this.balance = this.balance - amt;
		System.out.println(this.balance);
	}
	
	void deposit(int amt)
	{
		this.balance = this.balance+amt;
		System.out.println(this.balance);	
		
	}
	void display()
	{
		
		System.out.println(this.email);
	}


}