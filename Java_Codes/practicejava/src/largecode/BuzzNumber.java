package largecode;

import java.util.Scanner;

public class BuzzNumber {
	
	public boolean end(int n)
	{
		if(n%7!=0)
		{
			return false;
		}
		
		return true;
	}
	public boolean div(int n)
	{
		if(n%10!=7)
		{
			return false;
		}
		
		return true;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BuzzNumber bn=new BuzzNumber();
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean a=bn.div(n);
		System.out.println(a);
		boolean b=bn.end(n);
		System.out.println(b);
		if(a==true && b==true)
		{
			System.out.println(n+" is a buzz number");
		}
		else
		{
			System.out.println(n+" is NOT a buzz number");
		}
	}

}
