package javapackage;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		int count=0;
		int i=0;
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("No of words");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter the words");
		for(int k=0;k<n;k++)
		{
			str[k]=sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
				}
			}
			System.out.println(str[i]+ " appeared "+count +" times ");
			count=0;
			
		}
		
		
		
	}

}
