package largecode;

import java.util.Scanner;

public class MysteryNumber {
	public int mys(int n)
	{
	  int x=n/11;
	  
	  
	  return x;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n%11!=0)
		{
			System.out.println(n+ " :is not a mystery Number");
		}
		else
		{
			
		}
		// TODO Auto-generated method stub

	}

}
