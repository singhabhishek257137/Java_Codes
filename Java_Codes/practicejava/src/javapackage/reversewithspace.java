package javapackage;

import java.util.Scanner;

public class reversewithspace {
	private static void reverse(String s)
	{
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String- ");
		String s=sc.nextLine();
		reverse(s);

	}

}
//char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
//String s=new String(ch);  