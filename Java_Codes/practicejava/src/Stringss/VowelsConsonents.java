package Stringss;

import java.util.Scanner;

public class VowelsConsonents {
	
	void vowels(String s)
	{
		
		int l=s.length();
		char[] ch=new char[l];
		ch=s.toCharArray();
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
			}
		}
		int c=l-count;
		System.out.println( "number of vowels are: "+count);
		System.out.println( "number of vowels are: "+c);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		VowelsConsonents vc=new VowelsConsonents();
		System.out.println("Enter the string: ");
		String s=sc.next();
		vc.vowels(s);
		
		
	}

}
