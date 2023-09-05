package javapackage;

public class revesewithsamespace {
	private static void samespace(String s)
	{
		char[] rch=new char[s.length()];
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				rch[i]=' ';
			}
				
		}
		for(int j=ch.length-1;j>=0;j--)
		{
			if(rch[j]==' ')
			{
				ch[j]=' ';
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
