package largecode;

import java.util.Scanner;

public class EvilNumber {
	
	 static int CnBinary(int n)
	 { 
		 int count=0;
		 String s=Integer.toBinaryString(n);
		 System.out.println(s);
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)=='1')
			 {
				 count++;
			 }
			 
		 }
	    return count;
	 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EvilNumber obj=new EvilNumber();
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		int c=obj.CnBinary(x);
		System.out.println(c);
		if(c%2==0)
		{
			System.out.println(x+ " is a Evil Number");
		}
		else
		{
			System.out.println(x+ " is a Odious Number");
		}
	}

}
