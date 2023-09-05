package largecode;

import java.util.Scanner;

public class EmripNumber {
	public static boolean PrimeCheck(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			return false;
		}
		return true;
	}	
	public static int reverse(int n)
	{
		int sum=0;
		int x=n%10;
		n=n/10;
		sum=sum*10+x;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		boolean x=PrimeCheck(n);
		int s=reverse(n);
		boolean y=PrimeCheck(s);
		if (x==y)
		{
			System.out.println(n+ " is a Emrip Number");
		}
		else
		{
			System.out.println(n+ " is not a Emrip Number");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
