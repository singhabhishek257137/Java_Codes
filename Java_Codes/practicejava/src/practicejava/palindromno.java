package practicejava;

public class palindromno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1221;
		int a=0;
		int temp=p;
		while(p>0)
		{
		int x=p%10;
		 a=a*10+x;
		 p=p/10;
		}
		if(temp==a)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("no is not palindrom");
		}

	}

}
