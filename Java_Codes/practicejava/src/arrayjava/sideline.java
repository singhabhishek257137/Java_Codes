package arrayjava;

import java.util.Scanner;

public class sideline {

	public static void main(String[] args) {
		int a[]= {0,14,0,5,0,6};
		int l=a.length;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("number to be sidelined- ");
		int s=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			if(a[i]!=s)
			{
				
				a[count]=a[i];
				count++;
				
			}
		}
		while(count<l)
		{
			a[count++]=0;
		}
		for (int i=0; i<l; i++)
            System.out.print(a[i]+" ");
	
		
	}

}
/* 	int i;
		int j;
		for(i=0,j=l-1;i<j;i++,j--)
		{
			if(a[i]==s)
			{
				x[j]=a[i];
			}
			else
			{
				x[i]=a[i];
			}
		}*/