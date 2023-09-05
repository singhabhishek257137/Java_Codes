package largecode;

import java.util.Scanner;

public class PetersonNumber {
	int[] split(int n)
	{
		int l=Integer.toString(n).length();
		int[]  a=new int[l];
		for(int i=0;i<l;i++)
		if(n>0)
		{
			a[i]=n%10;
			n=n/10;
		}
		
		return a;
		
	}
	
	 int factorial(int f)
	 {
		 int fact=1;
		 for(int i=1;i<f+1;i++)
		 {
			  fact=fact*i;
		 }
	     return fact;	 
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PetersonNumber pn=new PetersonNumber();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int b=Integer.toString(n).length();
		int[] f=new int[b];
		f=pn.split(n);
		for(int i=0;i<b;i++)
		{	
		System.out.println(f[i]);
		}
		int sum=0;
		for(int i=0;i<b;i++)
		{
			int c=pn.factorial(f[i]);
			sum=sum+c;
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println(n+ " is a Peterson Number");
		}
		else
			System.out.println(n+ " is NOT a Peterson Number");
		
	}

}
