class MethodOverloading
{
	void show()
	{
		System.out.println("1");
	}
	void show(int a)
	{
		System.out.println("2");
	}
	void show(int a, String name)
	{
		System.out.println("3");
	}
	void show(String name,int a)
	{
		System.out.println("4");
	}
	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		MethodOverloading obj = new MethodOverloading(5);
		MethodOverloading obj = new MethodOverloading(10,Tanya);
		MethodOverloading obj = new MethodOverloading(Tanya,10);
		
}

//Mathod overloading can be achieved in these ways:
//Diff no. of arguments
//Diff type of argument
//Diff order of argument