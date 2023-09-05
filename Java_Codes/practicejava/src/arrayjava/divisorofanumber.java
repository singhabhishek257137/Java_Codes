package arrayjava;

import java.util.Scanner;

public class divisorofanumber {
	
	public static void main(String[] args) {
		
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("The number is: ");
			n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.printf("%d ", i);
				}
			}
		}
		
}

