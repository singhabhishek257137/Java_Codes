package largecode;

import java.lang.reflect.Array;
import java.util.Scanner;

public class XylemNumber {
	public  int[] arr(int n)
	{
		int len=String.valueOf(n).length();
		System.out.println(len);
		int[] a =new int[len];
		for(int i=0;i<len;i++)
		{
			a[i]=n%10;
			n=n/10;
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
		return a;
	}
	public void adds(int[] a)
	{
		int sum=0;
		int l=a.length;
		int sum1=a[0] +a[l-1];
		System.out.println("Sum1: "+sum1);
		for(int i=1;i<l-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum: "+sum);
		if(sum1==sum)
		{
			System.out.println("Number is a Xylem Number");
		}
		else
		{
			System.out.println("Number is NOT a Xylem Number");
		}
				
	}
	
	
	

	public static void main(String[] args) {
		XylemNumber x=new XylemNumber();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(String.valueOf(n).length()>3)
		{
			int[] a=x.arr(n);
			x.adds(a);
		}
		else
		{
			System.out.println("No a valid digit");
		}
		

}
}
