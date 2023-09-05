package arrayjava;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0;
		int even=0;
		int[] a= {2,7,8,10,6,11,4};
		for(int i=0;i<a.length;i++)
		{
			
			if((a[i]%2)==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
