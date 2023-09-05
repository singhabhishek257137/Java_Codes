package largecode;

import java.util.Scanner;

public class LargeArray {
	
	 int large(int m[])
	{
		int max=m[0];
		for(int i=1;i<5;i++)
		{	
		if(max>m[i])
		{
			max=m[i];
		}
		}
		return max;
		
	}
	 int small(int n[])
	{
		int min=n[0];
		for(int j=1;j<5;j++)
		{
			if(min<n[j])
			{
				min=n[j];
			}
			
		}
		return min;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array number:");
		int a[]=new int[5];
		System.out.println("Enter the array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		LargeArray obj=new LargeArray();
		int x=obj.large(a);
		int y=obj.small(a);
		int z=x+y;
		System.out.println(z);
		
	}	

}
