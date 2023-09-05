package largecode;

import java.util.Scanner;

public class NeonNumber {
	
	static boolean neon(int a)
	{
		int mul=1;
		int sum=0;
		while(a>0)
		{
			int c=a%10;
			sum=sum+c;
			mul=mul*c;
			a=a/10;
		}
		if(mul==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		NeonNumber n=new NeonNumber();
		System.out.println("Enter the number");
		int a=sc.nextInt();
		boolean x=n.neon(a);
		System.out.println("This is a " +x+ " Neon Number");
	}

}
