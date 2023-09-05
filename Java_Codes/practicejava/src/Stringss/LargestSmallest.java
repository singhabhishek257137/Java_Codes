package Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
	public void LargeSmall(String s)
	{
		
		String[] str=s.split(" ");
		int l=str.length;
		int[] c=new int[l];
		System.out.println(l);
		for(int i=0;i<l;i++)
			{
			System.out.println(str[i]);
			}
		int count=0;
		for(int i=0;i<l;i++)
		{
			String a=str[i];
			count=a.length();
			c[i]=count;
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.println(c[i]);
		}
		Arrays.sort(c);
		for(int j=0;j<l;j++)
		{
			System.out.println(c[j]);
		}
		for(int i=0;i<l;i++)
		{
			
			if(c[l-1]==str[i].length() )
			{
				System.out.println("Largest String: "+str[i]);
			}
			else if(c[0]== str[i].length())
			{
				System.out.println("Smallest String: "+str[i]);
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LargestSmallest ls=new LargestSmallest();
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		ls.LargeSmall(s);
		

	}

}
