package javapackage;

import java.util.Scanner;

public class removespace2 {
	private static void spacermv(String s)
	{
		String strwoutspace=s.replace(" ", "");
		System.out.println(strwoutspace);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String- ");
		String s=sc.nextLine();
		spacermv(s);

	}

	

}//.replaceAll("//s", "");
