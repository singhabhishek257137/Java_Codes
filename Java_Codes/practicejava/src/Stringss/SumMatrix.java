package Stringss;

import java.util.Scanner;

public class SumMatrix {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SumMatrix sm=new SumMatrix();
		
		System.out.println("Enter the Height and Width of the matrix:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the matxix digits: ");
		int[][] a=new int[l][b];
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<b;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<l;i++)
		{
			int sum=0;
			for(int j=0;j<b;j++)
			{
				sum=sum+a[i][j];
				
			}
			System.out.println("Sum of row " +i+" is " +sum);
		}
		for(int j=0;j<b;j++)
		{
			int sum=0;
			for(int i=0;i<l;i++)
			{
				sum=sum+a[i][j];
				
			}
			System.out.println("Sum of column " +j+" is " +sum);
		}
		

	}

}
