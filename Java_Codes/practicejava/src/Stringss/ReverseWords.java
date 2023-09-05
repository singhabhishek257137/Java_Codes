package Stringss;


import java.util.Scanner;

public class ReverseWords {
	public void reversew(String s)
	{
	
			String[] t=s.split(" ");
			System.out.println(t.length);
			 for(int i=t.length-1;i>=0;i--)
			 {
				 System.out.println(t[i]);
			 }
			 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ReverseWords rw=new ReverseWords();
		System.out.println("Enter the string");
		String s=sc.nextLine();
		rw.reversew(s);

}
		
}
