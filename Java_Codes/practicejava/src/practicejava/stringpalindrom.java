package practicejava;

public class stringpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="swaaj";
		int n=s.length();
		int i=0;int j=n-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("string not palindrom");
				i++;
				j--;
			}
			else
			{
				System.out.println("string  palindrom");
			}
		}

	}

}
