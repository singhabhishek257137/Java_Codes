package largecode;

import java.util.Scanner;

public class BouncyNumber {

	static void BounceBaby(int n)
	{
		
				
		if(inc(n) ||dec(n) ||(n<101))
		{
			System.out.println("Bouncy Number");
		}
		else
			System.out.println("not a bouncy");
	}
	public static boolean inc(int n)
		{
		 	boolean flag=true;
			String str=Integer.toString(n);
			char ch;
			
			for(int i=0;i<str.length()-1;i++)
			{
				ch=str.charAt(i);
				if(ch>str.charAt(i+1))
				{ 
					flag=false;
					break;
				}
				
				
			}
			return flag;
		}
	public static boolean dec(int n)
	{
		boolean flag=true;
		String str=Integer.toString(n);
		char ch;
		for(int i=0;i<str.length()-1;i++)
		{
			ch=str.charAt(i);
			if(ch<str.charAt(i+1))
			{
				flag=false;
				break;	
			}
		}
		
		return flag;
		
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BouncyNumber bn=new BouncyNumber();
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		bn.BounceBaby(n);

	}

}
