package javapackage;

import java.util.Scanner;

 public class  countwords {
	private static void countwords(String s)

	{
		int count=0;
		String[] words=s.split(" ");
		for(String word:words)
		{
			count++;
		}
		System.out.println("no of words are- "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word -");
		String s=sc.nextLine();
		countwords(s);
	}		
}


