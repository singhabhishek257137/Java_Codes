package arrayjava;

import java.util.Scanner;

public class SecondSmallest {
	void smallest(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp;
				if(a[i]>a[j])
					
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SecondSmallest ss=new SecondSmallest();
		System.out.println("Enter the length of array: ");
		int l=sc.nextInt();
		System.out.println("Enter the array: ");
		
		int[] a=new int[l];
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		ss.smallest(a);
		System.out.println(a[1]);
	}

}
