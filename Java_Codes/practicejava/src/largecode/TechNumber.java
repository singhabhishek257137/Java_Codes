package largecode;

import java.util.Scanner;

public class TechNumber {
	
	public boolean tech(int x)
	{
		int z;
		int temp=x;
		int y=temp%100;
		temp=temp/100;
	    z=temp+y;
		int p=z*z;
		if(p==x)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	public static void main(String[] args) {
		boolean b;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TechNumber obj=new TechNumber();
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		if(a>1000)
		{
			 System.out.println("This is the tech Number: " +(b=obj.tech(a)));
		}
		else
		{
			System.out.println("This is not a tech number.");
		}
	}

}
