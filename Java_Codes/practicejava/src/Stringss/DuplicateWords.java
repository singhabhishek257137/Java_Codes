package Stringss;

import java.util.Scanner;

public class DuplicateWords {
	void duplicate(String s)
	{
		int l=s.length();
		char[] a=new char[l];
		a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(count>1 && a[i]!='0')
			{
				System.out.println(a[i]);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DuplicateWords dw=new DuplicateWords();
		System.out.println("Enter the String : ");
		String s=sc.next();
		dw.duplicate(s);

	}

}
