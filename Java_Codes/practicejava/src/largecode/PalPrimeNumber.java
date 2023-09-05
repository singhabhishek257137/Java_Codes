package largecode;

import java.util.Scanner;

public class PalPrimeNumber {
	
	
		
		public boolean pal(int b)
		{
			int sum=0;
			int r;
				while(b>0)
				{	
					r=b%10;
					sum=(10*sum)+r;
					
						
				}
				if(sum==b)
					return true;
				else		
					return false;
			
	}
		public  boolean prime(int b)
		{
			int count=0;
			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				count++;		
			}	
			
			if(count==2)
			{
				return true;
			}
			else	
			{
				return false;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x=sc.nextInt();
		PalPrimeNumber obj=new PalPrimeNumber();
		if(obj.pal(x)==true && obj.prime(x)==true)
		{
			System.out.println("number is palprime");
		}
		else
		{
			System.out.println("number is fake");
		}
	    
		
	}

}
