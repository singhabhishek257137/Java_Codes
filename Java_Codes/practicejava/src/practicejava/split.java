package practicejava;

public class split {

	public static void main(String[] args) {
		String str="java,selenium,maven,testng";
		String[] s=str.split(",");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
