package practicejava;

import java.util.Scanner;

public class countoccurence {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array");
		{
			for(int i=0;i<a.length;i++)
			{
				 a[i]=s.nextInt();
			}
		}
		System.out.println("Enter the digit whos no is to be counted");
		int x=s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("Number of Occurrence of the Element:"+count);
		

	

}
}