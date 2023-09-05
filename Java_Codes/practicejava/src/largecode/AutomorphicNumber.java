package largecode;

import java.util.Scanner;

public class AutomorphicNumber {
	void Morphic(int a)
	{
		int b=a*a;
		String s=Integer.toString(b);
		String t=Integer.toString(a);
		int l=s.length();
		int m=t.length();
		System.out.println(l);
		System.out.println(m);
		System.out.println(s.charAt(l-1));
		System.out.println(t.charAt(l-2));
		System.out.println(s.charAt(l-2));
		System.out.println(t.charAt(l-3));
		
		for(int i=l-1;i<=0;i--)
		{
			if(s.charAt(i)==t.charAt(i-1))
			{
				System.out.println("Number is Automorphic");
			}
			else
			{
				System.out.println("Number is NOT an Automorphic");
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AutomorphicNumber an=new AutomorphicNumber();
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		an.Morphic(a);
		
	}

}
