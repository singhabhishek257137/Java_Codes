package practicejava;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=18;
		System.out.println("factorial of "+a+" are: ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
