package javapackage;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String add="";
		Scanner sc=new Scanner(System.in);
		System.out.println("give the the word user:");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println(s.length());
		char con=s.charAt(0);
		for(int i =s.length()-1; i>=0; i--)
		{
			add=add + s.charAt(i);
			
		}
		System.out.println(add);



	}

}
