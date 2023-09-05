package largecode;

import java.util.Scanner;

public class SunnyNumber {
	boolean sunny(int n)
	{
		double a;
		int b;
		a=n+1;
		b=(int)Math.sqrt(a);
		if(b*b==a)
		{
			return true;
		}
		
		return false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SunnyNumber sn=new SunnyNumber();
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a>0)
		{
			boolean s=sn.sunny(a);
			System.out.println("This is a " +s+" sunny number" );
		}
		else
			System.out.println("This is not a boolean number");
		

	}

}
