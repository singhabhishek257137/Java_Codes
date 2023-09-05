package arrayjava;

public class intersectionarray {

	public static void main(String[] args) {
	int a[]= {2,3,6,4,9,21,11};
	int b[]= {7,9,10,21,6,42,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}
		}
	}

}
}