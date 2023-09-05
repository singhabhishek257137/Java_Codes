package largecode;

class Bank {
	
	float amt;
	int accNo;
	String name;
	
	void Initialize(int ac,float a,String n)
	{
		amt=a;
		accNo=ac;
		name=n;
	}
	
	void Display()
	{
		System.out.println(accNo+" "+name+" "+amt);
	}
	void disp()
	{
		System.out.println("Balance is " +amt);
	}
	
	void deposite(float depamt)
	{
		amt=depamt+amt;
		System.out.println(depamt+ " Deposited");
		
	}
	void withdrawn(float withdraw)
	{
		if(amt>=withdraw)
		{	
		amt=amt-withdraw;
		System.out.println(withdraw+ " Withdrawn");
		}
		else
		{
		System.out.println("Insufficient Balance");	
		}
	}
	
	public class TestAccount{  
		public static void main(String[] args){  
		Bank a1=new Bank();  
		a1.Initialize(12345,5000,"Abhishek");
		a1.disp();
		a1.deposite(200);
		a1.disp();
		a1.withdrawn(550);
		a1.disp();
		
}
}
}