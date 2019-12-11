class Account
{
	int acc_no;
	String name;
	float bal;
	
	//void insert(int a, String n, float b) We can use same names for variables and parameters to avoid confusion. This keyword cane be used
	void insert(int acc_no, String name, float bal)
	{
//		acc_no=a;
//		name=n;
//		bal=b;
		this.acc_no=acc_no;
		this.name=name;
		this.bal=bal;
	}
	
	void display()
	{
		System.out.println("Account number:"+acc_no +" Name:"+name +" Balance:"+bal);
	}
	
	void checkBalance()
	{
		System.out.println("Current balance is: " +bal);
	}
	
	void deposit(float amt)
	{
		bal = bal+amt;
		System.out.println(amt +" deposited");
	}
	
	void withdraw(float amt)
	{
		if(bal<amt)
			System.out.println("Insufficient bal");
		else
		{
			bal=bal-amt;
			System.out.println(amt +" Withdrawn");
		}
	}
}

public class TestObjectClass 
{
	public static void main(String[] args) 
	{
		Account a=new Account();
		a.insert(215496,"Pravs",100000);
		a.display();
		a.checkBalance();
		a.deposit(10000);
		a.checkBalance();
		a.withdraw(200000);
		a.withdraw(10000);
		a.checkBalance();
	}
}
