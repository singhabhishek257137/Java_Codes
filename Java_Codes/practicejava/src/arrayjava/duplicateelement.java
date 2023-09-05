package arrayjava;

import java.util.Scanner;

public class duplicateelement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array-");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array ");
		for(int x=0;x<5;x++)
		{
			a[x]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
		
		
	}

}
//int[] a=new int[] {1,3,5,5,3};

