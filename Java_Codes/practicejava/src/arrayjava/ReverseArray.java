package arrayjava;

import java.util.Scanner;

public class ReverseArray {
	void reverse(int[] a)
	{
		
		int s=a.length;
		int[] b=new int[s];
			
			for(int j=s-1,i=0;j>=0 && i<s ;j--,i++)
			{
				b[j]=a[i];
			}
			for(int i=0;i<s;i++)
			{
				System.out.println(b[i]);
			}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ReverseArray ra=new ReverseArray();
		System.out.println("Enter the length of array: ");
		int l=sc.nextInt();
		System.out.println("Enter the array: ");
		
		int[] a=new int[l];
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<l;j++)
		{
			System.out.println(a[j]);
		}
		ra.reverse(a);
		}

}
