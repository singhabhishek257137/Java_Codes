package largecode;

import java.util.Scanner;

public class FascinatingNumber {
	
	public void fasc(int i)
	{
		int j,k;
		j=i*2;
		k=i*3;
		String concat=i+""+j+k;
		boolean found=true;
		
		for(char c='1';c<='9';c++)
		{
			int a=0;
			for(int b=1;b<concat.length();b++)
			{
				char p=concat.charAt(c);
				if(p==c)
					a++;
			}
				
					if(a>1|| a==0)
					{
						found=false;
						break;
					}
					if(found)
					{
						System.out.println("This is not a fascinating" );
					}
					else
					{
						System.out.println("This is  a fascinating" );
					}
						
				
				
			}
			
		}
				
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int s=sc.nextInt();
		FascinatingNumber fc=new FascinatingNumber();
		fc.fasc(s);

	}

}
