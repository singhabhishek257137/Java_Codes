package javapackage;

import java.util.Scanner;

public class removespace {
	private static void spaceremove(String s)
	{
		String add="";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			add=add+str[i];
		}
		System.out.println(add);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String- ");
		String s=sc.nextLine();
		spaceremove(s);
		

	}

	

}
