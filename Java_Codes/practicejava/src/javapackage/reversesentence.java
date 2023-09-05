package javapackage;

import java.util.Scanner;

public class reversesentence {

	public static void main(String[] args) {
		String ch=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		System.out.println("word is- " + str);
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=ch+str.charAt(i);
		}
		System.out.println(ch);

	}

}
