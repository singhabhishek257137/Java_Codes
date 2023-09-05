package javapackage;

import java.util.Scanner;
 

public class raveseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first word in java");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of string array");
		int n=sc.nextInt();
		String[] str=new  String[n];
		System.out.println("enter the words to be reversed");
		
			for(int i=0;i<n;i++)
			{
				str[i]=sc.nextLine();
			}
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
			for(int i=str.length-1;i>=0;i--)
			{
				System.out.println(str[i]);
			}
		
			

	}

}
