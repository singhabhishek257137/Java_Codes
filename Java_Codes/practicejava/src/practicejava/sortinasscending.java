package practicejava;

import java.util.Scanner;

public class sortinasscending {
	public static void heightwise(int n,int[] h)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(h[i]>h[j])
				{
					
					int temp=0;
					temp=h[i];
					System.out.println(temp);
					h[i]=h[j];
					h[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		int[] h = new int[n];
		System.out.println("Given height of the students: ");
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		heightwise(n,h);
	}
}


