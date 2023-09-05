package javapackage;

import java.util.Scanner;

public class characteroccurence {
	private static void occurence(String s,String g)
	{
		int count=0;
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(g.equalsIgnoreCase(str[i]))
			{
				count++;
			}
		}System.out.println(g+ " has appeared for "+count+ " times.");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide the sentence- ");
		String s=sc.nextLine();
		System.out.println("provide the target word- ");
		String g=sc.nextLine();
		occurence(s,g);

	}

}
