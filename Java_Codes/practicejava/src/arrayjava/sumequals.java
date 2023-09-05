package arrayjava;

import java.util.Scanner;

public class sumequals {

	public static void main(String[] args) {
		int a[]= {4,3,7,5,2,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the req sum- ");
		int s=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==s)
				{
					System.out.println(a[i]+", "+a[j]);
				}
			}
		}
		

	}

}
