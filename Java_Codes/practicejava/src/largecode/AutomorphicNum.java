package largecode;

import java.util.Scanner;

public class AutomorphicNum {
	
	boolean auto(int n)
	{
		int a=n*n;
		String s=Integer.toString(n);
		String t=Integer.toString(a);
		if(t.contains(s))
		{
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AutomorphicNum an=new AutomorphicNum();
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		boolean b=an.auto(a);
		System.out.println(b);
		
		
	}

}

