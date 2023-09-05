package largecode;

public class StrCompare {

	public static void main(String[] args) {
		
		
		{
			String Str="I am a footballer";
			String obj=new String("I am a footballer");
			
			if(Str.contentEquals(obj))
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("String is not equal");
			}
			
			String s=new String("I am a cricket");
			if(s.contentEquals(s))
			{
				System.out.println("String is not equal");
			}
			else
			{
				System.out.println("String is equal");
			}
		}

	}

}
