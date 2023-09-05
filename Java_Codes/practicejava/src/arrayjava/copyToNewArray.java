package arrayjava;

import java.util.Scanner;

public class copyToNewArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int a=sc.nextInt();
		int[] x=new int[a];
		int[] y=new int[a];
		System.out.println("Array is: ");
		for(int i=0;i<a;i++)
		{	
		 x[i]= sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
		System.out.println(x[i]);
		}
		for(int i=0;i<a;i++)
		{
			y[i]=x[i];
		}
		System.out.println("Copied Array:");
		for(int i=0;i<a;i++)
		{
			System.out.println(y[i]);
		}
		
		

	}

}
