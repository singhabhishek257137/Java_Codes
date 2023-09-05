package Stringss;

import java.util.Scanner;

public class ReplaceWithSpecific {

	public void replace(String s)
	{
		char[] ch=s.toCharArray();
		int l=s.length();
		System.out.println(l);
		for(int i=0;i<l;i++)
		{
			if(ch[i]==' ')
			{
				ch[i]='%';
			}
			
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ReplaceWithSpecific rws=new ReplaceWithSpecific();
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		System.out.println(s);
		rws.replace(s);
		

	}

}
