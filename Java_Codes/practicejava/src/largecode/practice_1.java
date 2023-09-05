package largecode;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i+1];
		}
			
	}

}
