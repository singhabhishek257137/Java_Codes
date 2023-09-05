package largecode;

import java.util.Scanner;

public class AlternatePrime {
			
		boolean isPrime(int n) {
			
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AlternatePrime ap=new AlternatePrime();
		System.out.println("Enter the Number");
		int[] a=new int[10];
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
			
		{
		boolean s=ap.isPrime(i);
		 	if(s==true)
		 	{
		 		count++;
		 		if(count%2==0)
		 			System.out.println(i+ " ");
		 	}
		}
		
		
		
		
		
		
	}

}
