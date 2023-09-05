package largecode;

import java.util.Scanner;

public class SpyNumber {
	
	static int SplitAdd(int a)
	{
		int sum1=0;
		while(a>0)
		{
		int b=a%10;
		sum1=sum1+b;
		a=a/10;
		}
		
		return sum1;
	}
	static int SplitMul(int a)
	{
		int mul=1;
		while(a>0)
		{
		int b=a%10;
		mul=mul*b;
		a=a/10;
		}
		
		return mul;
		
	}

	public static void main(String[] args) {
		SpyNumber s=new SpyNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Spy Number");
		int a=sc.nextInt();
		if(s.SplitAdd(a)==s.SplitMul(a))
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}
		
		
		// TODO Auto-generated method stub

	}

}
