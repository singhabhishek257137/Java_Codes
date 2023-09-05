package practicejava;

public class constructors {
	int id;
	String name;
	public constructors(int id,String name)
	{
		this.id=id;
		this.name=name;

		System.out.println(id);
		System.out.println(name);	
	}
	public void method()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		constructors obj1=new constructors(101,"abhishek");
		obj1.method();
	}

}//obj1.method();
