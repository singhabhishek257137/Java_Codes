package Stringss;

import java.util.Scanner;

public class ReverseString {
	public String reverse(String s)
	{
		if(s.isEmpty())
		{
			return s;
		}
		
		return reverse(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ReverseString rs=new ReverseString();
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		System.out.println(s);
		
		String a=rs.reverse(s);
		System.out.println(a);
	}

}
